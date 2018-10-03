package eu.europeana.iiif.web;

import eu.europeana.iiif.model.Definitions;
import eu.europeana.iiif.model.EdmDateUtils;
import eu.europeana.iiif.service.ManifestService;
import eu.europeana.iiif.service.ValidateUtils;
import eu.europeana.iiif.service.exception.IIIFException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URL;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static eu.europeana.iiif.model.Definitions.MEDIA_TYPE_IIIF_JSONLD_V2;
import static eu.europeana.iiif.model.Definitions.MEDIA_TYPE_IIIF_JSONLD_V3;

/**
 * Rest controller that handles manifest requests
 *
 * @author Patrick Ehlert
 * Created on 06-12-2017
 */
@RestController
public class ManifestController {

    /* for parsing accept headers */
    private static final Pattern acceptProfilePattern = Pattern.compile("profile=\"(.*?)\"");

    private ManifestService manifestService;

    public ManifestController(ManifestService manifestService) {
        this.manifestService = manifestService;
    }

    /**
     * Handles manifest requests
     * @param collectionId (required field)
     * @param recordId (required field)
     * @param wskey apikey (required field)
     * @param version (optional) indicates which IIIF version to generate, either '2' or '3'
     * @param recordApi (optional) alternative recordApi baseUrl to use for retrieving record data
     * @param fullTextApi (optional) alternative fullTextApi baseUrl to use for retrieving record data
     * @return JSON-LD string containing manifest
     * @throws IIIFException when something goes wrong during processing
     */
    @SuppressWarnings("squid:S00107") // too many parameters -> we cannot avoid it.

    @GetMapping(value = "/presentation/{collectionId}/{recordId}/manifest")
    public ResponseEntity<String> manifestRequest(
                @PathVariable String collectionId,
                @PathVariable String recordId,
                @RequestParam(value = "wskey", required = true) String wskey,
                @RequestParam(value = "format", required = false) String version,
                @RequestParam(value = "recordApi", required = false) URL recordApi,
                @RequestParam(value = "fullText", required = false, defaultValue = "true") Boolean addFullText,
                @RequestParam(value = "fullTextApi", required = false) URL fullTextApi,
                HttpServletRequest request,
                HttpServletResponse response) throws IIIFException {
        // TODO integrate with apikey service?? (or leave it like this?)

        String id = "/"+collectionId+"/"+recordId;
        ValidateUtils.validateWskeyFormat(wskey);
        ValidateUtils.validateRecordIdFormat(id);

        if (recordApi != null) {
            ValidateUtils.validateApiUrlFormat(recordApi);
        }
        if (fullTextApi != null) {
            ValidateUtils.validateApiUrlFormat(fullTextApi);
        }

        HttpHeaders headers = new HttpHeaders();
        if (!isAcceptHeaderOK(request)){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        // if no version was provided as request param, then we check the accept header for a profiles= value
        String iiifVersion = version;
        if (iiifVersion == null) {
            iiifVersion = versionFromAcceptHeader(request);
        }

        String json    = manifestService.getRecordJson(id, wskey, recordApi);
        Date   updated = manifestService.getTimestampUpdate();
        String eTag    = manifestService.getSHA256Hash(iiifVersion);

        headers.add("eTag", "\"" + eTag + "\"");
        headers.add("Last-Modified", EdmDateUtils.headerDateToString(updated));
        // TODO move Cache control to the Spring Boot security configuration when that's implemented
        headers.add("Cache-Control", "no-cache");
        // using the Vary header is debatable: https://www.smashingmagazine.com/2017/11/understanding-vary-header/
        headers.add("Vary", "Accept");

        // chosen this implementation instead of the 'shallow' out-of-the-box spring boot version because that does not
        // offer the advantage of saving on processing time
        if (( StringUtils.isNotEmpty(request.getHeader("If-Modified-Since")) &&
              EdmDateUtils.headerStringToDate(request.getHeader("If-Modified-Since")).compareTo(updated) > 0 )
            ||
            ( StringUtils.isNotEmpty(request.getHeader("If-None-Match")) &&
              StringUtils.equalsIgnoreCase(request.getHeader("If-None-Match"), eTag))){
            return new ResponseEntity<>(headers, HttpStatus.NOT_MODIFIED);
        } else if (StringUtils.isNotEmpty(request.getHeader("If-Match")) &&
                   (!StringUtils.equalsIgnoreCase(request.getHeader("If-Match"), eTag) &&
                    !StringUtils.equalsIgnoreCase(request.getHeader("If-Match"), "*"))){
            return new ResponseEntity<>(headers, HttpStatus.PRECONDITION_FAILED);
        }

        Object manifest;
        if ("3".equalsIgnoreCase(iiifVersion)) {
            manifest = manifestService.generateManifestV3(json, addFullText, fullTextApi);
            headers.add("Content-Type", MEDIA_TYPE_IIIF_JSONLD_V3);
        } else {
            manifest = manifestService.generateManifestV2(json, addFullText, fullTextApi); // fallback option
            headers.add("Content-Type", MEDIA_TYPE_IIIF_JSONLD_V2);
        }

        return new ResponseEntity<>(manifestService.serializeManifest(manifest),
                                    headers,
                                    HttpStatus.OK);
    }

    private String versionFromAcceptHeader(HttpServletRequest request) {
        String result = "2"; // default version if no accept header is present
        String accept = request.getHeader("Accept");
        if (StringUtils.isNotEmpty(accept)) {
            Matcher m = acceptProfilePattern.matcher(accept);
            if (m.find()) {
                String profiles = m.group(1);
                if (profiles.toLowerCase(Locale.getDefault()).contains(Definitions.MEDIA_TYPE_IIIF_V3)) {
                    result = "3";
                } else {
                    result = "2";
                }
            }
        }
        return result;
    }

    private boolean isAcceptHeaderOK(HttpServletRequest request){
        String accept = request.getHeader("Accept");
        return (StringUtils.isBlank(accept)) ||
               (StringUtils.containsIgnoreCase(accept, "*/*")) ||
               (StringUtils.containsIgnoreCase(accept, "application/json")) ||
               (StringUtils.containsIgnoreCase(accept, "application/ld+json"));
    }
}

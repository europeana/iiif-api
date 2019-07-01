package eu.europeana.iiif.model.v3;

import eu.europeana.iiif.model.Definitions;

/**
 * Source data of the resource, see http://prezi3.iiif.io/api/presentation/3.0/#technical-properties.
 * Not to be confused with a Dataset in Europeana.
 *
 * @author Patrick Ehlert
 * Created on 06-02-2018
 */
public class DataSet extends JsonLdIdType {

    private static final long serialVersionUID = -8010439369804222272L;

    private String format;
    private String profile = Definitions.EDM_SCHEMA_URL;

    public DataSet(String id, String format) {
        super(id, "Dataset");
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getProfile() {
        return profile;
    }
}

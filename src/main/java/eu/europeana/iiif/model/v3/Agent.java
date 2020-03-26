package eu.europeana.iiif.model.v3;

import eu.europeana.iiif.model.Definitions;

/**
 *  Contains a static reference to Europeana as a provider (in English language)
 *  @author Patrick Ehlert
 *  Created on 9-3-2020
 */
public class Agent extends JsonLdIdType {

    private static Text[] europeanaHomepage = new Text[]{ new Text("https://www.europeana.eu",
                                                      new LanguageMap(LanguageMap.DEFAULT_METADATA_KEY, "Europeana")) };
    private static Image[] logo = new Image[]{ new Image(Definitions.EUROPEANA_LOGO_URL) };

    public Agent() {
        super("https://www.europeana.eu/en/about-us", "Agent");
    }

    public Text[] getHomepage() {
        return europeanaHomepage;
    }

    public Image[] getLogo() {
        return logo;
    }

}
package eu.europeana.iiif;

/**
 * Test data (taken from record API)
 * @author Patrick Ehlert
 * Created on 16-02-2018
 */
public class ExampleData {


    public static final String EXAMPLE_RECORD_PARENT_ID = "/9200356/BibliographicResource_3000100340004";
    public static String EXAMPLE_RECORD_PARENT_RESPONSE = "{\"apikey\":\"xxx\",\"success\":true,\"statsDuration\":136,\"requestNumber\":999,\"object\":{\"title\":[\"Edasi\"],\"europeanaCompleteness\":5,\"aggregations\":[{\"about\":\"/aggregation/provider/9200356/BibliographicResource_3000100340004\",\"edmDataProvider\":{\"def\":[\"National Library of Estonia\"]},\"edmIsShownBy\":\"http://iiif.europeana.eu/records/WEAN3VQN7DMJ7FZ5HV5ALCO5MUPSARJXSZVSWIXSRTXPQAHTRLXQ/representations/presentation_images/versions/9667bc30-fd2b-11e5-bc8a-fa163e60dd72/files/node-3/image/NLE/Edasi/1936/03/30/1/19360330_1-0001/full/full/0/default.jpg\",\"edmObject\":\"http://iiif.europeana.eu/records/WEAN3VQN7DMJ7FZ5HV5ALCO5MUPSARJXSZVSWIXSRTXPQAHTRLXQ/representations/presentation_images/versions/9667bc30-fd2b-11e5-bc8a-fa163e60dd72/files/node-3/image/NLE/Edasi/1936/03/30/1/19360330_1-0001/full/full/0/default.jpg\",\"edmProvider\":{\"en\":[\"The European Library\"]},\"edmRights\":{\"def\":[\"http://creativecommons.org/publicdomain/mark/1.0/\"]},\"aggregatedCHO\":\"/item/9200356/BibliographicResource_3000100340004\",\"webResources\":[{\"about\":\"http://iiif.europeana.eu/records/WEAN3VQN7DMJ7FZ5HV5ALCO5MUPSARJXSZVSWIXSRTXPQAHTRLXQ/representations/presentation_images/versions/9667bc30-fd2b-11e5-bc8a-fa163e60dd72/files/node-3/image/NLE/Edasi/1936/03/30/1/19360330_1-0001/full/full/0/default.jpg\",\"textAttributionSnippet\":\"Edasi - http://europeana.eu/portal/record/9200356/BibliographicResource_3000100340004.html. National Library of Estonia. Public Domain - http://creativecommons.org/publicdomain/mark/1.0/\",\"htmlAttributionSnippet\":\"<span about='http://data.europeana.eu/item/9200356/BibliographicResource_3000100340004'><a href='http://europeana.eu/portal/record/9200356/BibliographicResource_3000100340004.html'><span property='dc:title'>Edasi</span></a>. National Library of Estonia. <a href='http://creativecommons.org/publicdomain/mark/1.0/' rel='xhv:license http://www.europeana.eu/schemas/edm/rights'>Public Domain</a><span rel='cc:useGuidelines' resource='http://www.europeana.eu/rights/pd-usage-guide/'>.</span></span>\",\"svcsHasService\":[\"http://iiif.europeana.eu/records/WEAN3VQN7DMJ7FZ5HV5ALCO5MUPSARJXSZVSWIXSRTXPQAHTRLXQ/representations/presentation_images/versions/9667bc30-fd2b-11e5-bc8a-fa163e60dd72/files/node-3/image/NLE/Edasi/1936/03/30/1/19360330_1-0001\"]}],\"edmPreviewNoDistribute\":false}],\"about\":\"/9200356/BibliographicResource_3000100340004\",\"europeanaAggregation\":{\"about\":\"/aggregation/europeana/9200356/BibliographicResource_3000100340004\",\"aggregatedCHO\":\"/item/9200356/BibliographicResource_3000100340004\",\"edmLandingPage\":\"http://europeana.eu/portal/record/9200356/BibliographicResource_3000100340004.html\",\"edmCountry\":{\"def\":[\"estonia\"]},\"edmLanguage\":{\"def\":[\"et\"]},\"edmPreview\":\"http://europeanastatic.eu/api/image?uri=http%3A%2F%2Fiiif.europeana.eu%2Frecords%2FWEAN3VQN7DMJ7FZ5HV5ALCO5MUPSARJXSZVSWIXSRTXPQAHTRLXQ%2Frepresentations%2Fpresentation_images%2Fversions%2F9667bc30-fd2b-11e5-bc8a-fa163e60dd72%2Ffiles%2Fnode-3%2Fimage%2FNLE%2FEdasi%2F1936%2F03%2F30%2F1%2F19360330_1-0001%2Ffull%2Ffull%2F0%2Fdefault.jpg&size=LARGE&type=TEXT\"},\"proxies\":[{\"about\":\"/proxy/provider/9200356/BibliographicResource_3000100340004\",\"dcLanguage\":{\"def\":[\"et\"]},\"dcTitle\":{\"def\":[\"Edasi\"]},\"dcType\":{\"def\":[\"http://data.europeana.eu/concept/base/18\"]},\"dctermsIsPartOf\":{\"def\":[\"http://data.theeuropeanlibrary.org/Collection/a0616\"],\"en\":[\"Europeana Newspapers\"]},\"dctermsIssued\":{\"def\":[\"1919-01-05 - 1937-12-22\"]},\"proxyIn\":[\"/aggregation/provider/9200356/BibliographicResource_3000100340004\"],\"proxyFor\":\"/item/9200356/BibliographicResource_3000100340004\",\"edmType\":\"TEXT\",\"europeanaProxy\":false},{\"about\":\"/proxy/europeana/9200356/BibliographicResource_3000100340004\",\"proxyIn\":[\"/aggregation/europeana/9200356/BibliographicResource_3000100340004\"],\"proxyFor\":\"/item/9200356/BibliographicResource_3000100340004\",\"edmType\":\"TEXT\",\"europeanaProxy\":true}],\"language\":[\"et\"],\"europeanaCollectionName\":[\"9200356_Ag_EU_TEL_a0616_Newspapers_Estonia\"],\"services\":[{\"about\":\"http://iiif.europeana.eu/records/WEAN3VQN7DMJ7FZ5HV5ALCO5MUPSARJXSZVSWIXSRTXPQAHTRLXQ/representations/presentation_images/versions/9667bc30-fd2b-11e5-bc8a-fa163e60dd72/files/node-3/image/NLE/Edasi/1936/03/30/1/19360330_1-0001\",\"id\":{\"timestamp\":1512119859,\"machineIdentifier\":14987444,\"processIdentifier\":-15654,\"counter\":4472184,\"timeSecond\":1512119859,\"date\":1512119859000,\"time\":1512119859000},\"dctermsConformsTo\":[\"http://iiif.io/api/image\"],\"doapImplements\":[\"http://iiif.io/api/image/2/level1.json\"]}],\"providedCHOs\":[{\"about\":\"/item/9200356/BibliographicResource_3000100340004\"}],\"edmDatasetName\":[\"9200356_Ag_EU_TEL_a0616_Newspapers_Estonia\"],\"type\":\"TEXT\",\"timestamp_created_epoch\":1409852986341,\"timestamp_update_epoch\":1512119859146,\"timestamp_created\":\"2014-09-04T17:49:46.341Z\",\"timestamp_update\":\"2017-12-01T09:17:39.146Z\"}}";

    public static final String EXAMPLE_RECORD_CHILD_ID = "/9200408/BibliographicResource_3000117822022";
    public static String EXAMPLE_RECORD_CHILD_RESPONSE = "{\"apikey\":\"xxx\",\"success\":true,\"statsDuration\":246,\"requestNumber\":999,\"object\":{\"title\":[\"Le Journal des Débats politiques et littéraires - 1940-02-15\"],\"europeanaCompleteness\":7,\"timespans\":[{\"about\":\"http://semium.org/time/1940\",\"prefLabel\":{\"def\":[\"1940\"]},\"begin\":{\"def\":[\"Mon Jan 01 00:20:00 CET 1940\"]},\"end\":{\"def\":[\"Tue Dec 31 02:00:00 CEST 1940\"]},\"isPartOf\":{\"def\":[\"http://semium.org/time/19xx_2_third\"]}},{\"about\":\"http://semium.org/time/AD2xxx\",\"prefLabel\":{\"en\":[\"Second millenium AD\",\"Second millenium AD, years 1001-2000\"],\"fr\":[\"2e millénaire après J.-C.\"]},\"isPartOf\":{\"def\":[\"http://semium.org/time/ChronologicalPeriod\"]}},{\"about\":\"http://semium.org/time/19xx_2_third\",\"prefLabel\":{\"ru\":[\"Середина 20-го века\"],\"en\":[\"Mid 20th century\"]},\"begin\":{\"def\":[\"Mon Jan 01 00:19:32 CET 1934\"]},\"end\":{\"def\":[\"Sat Dec 31 01:00:00 CET 1966\"]},\"isPartOf\":{\"def\":[\"http://semium.org/time/19xx\"]}},{\"about\":\"http://semium.org/time/ChronologicalPeriod\",\"prefLabel\":{\"en\":[\"Chronological period\"]},\"isPartOf\":{\"def\":[\"http://semium.org/time/Time\"]}},{\"about\":\"http://semium.org/time/19xx\",\"prefLabel\":{\"ru\":[\"20й век\"],\"def\":[\"20..\",\"20??\",\"20e\"],\"en\":[\"20-th\",\"20th\",\"20th century\"],\"fr\":[\"20e siècle\"],\"nl\":[\"20de eeuw\"]},\"begin\":{\"def\":[\"Tue Jan 01 00:19:32 CET 1901\"]},\"end\":{\"def\":[\"Sun Dec 31 01:00:00 CET 2000\"]},\"isPartOf\":{\"def\":[\"http://semium.org/time/AD2xxx\"]}},{\"about\":\"http://semium.org/time/Time\",\"prefLabel\":{\"en\":[\"Time\"]}}],\"concepts\":[{\"about\":\"http://vocab.getty.edu/aat/300026656\",\"prefLabel\":{\"en\":[\"newspapers\"],\"es\":[\"diarios (noticias)\"],\"nl\":[\"kranten\"]},\"altLabel\":{\"de\":[\"Tageszeitung\"],\"sv\":[\"tidning\"],\"en\":[\"newspaper\"],\"it\":[\"giornale (newspaper)\"],\"fr\":[\"journal (newspaper)\"],\"nl\":[\"nieuwsbladen\"],\"es\":[\"diario (noticias)\"]},\"note\":{\"def\":[\"http://vocab.getty.edu/aat/rev/5002531933\"]},\"broader\":[\"http://vocab.getty.edu/aat/300026642\"],\"narrower\":[\"http://vocab.getty.edu/aat/300404424\"]}],\"aggregations\":[{\"about\":\"/aggregation/provider/9200408/BibliographicResource_3000117822022\",\"edmDataProvider\":{\"def\":[\"National Library of France\"]},\"edmIsShownBy\":\"http://www.theeuropeanlibrary.org/tel4/newspapers/issue/fullscreen/3000117822022\",\"edmIsShownAt\":\"http://ing-prod-preview-api.eanadev.org/api/xxx/redirect?shownAt=http%3A%2F%2Fwww.theeuropeanlibrary.org%2Ftel4%2Fnewspapers%2Fissue%2F3000117822022&provider=The+European+Library&id=http%3A%2F%2Fwww.europeana.eu%2Fresolve%2Frecord%2F9200408%2FBibliographicResource_3000117822022&profile=full\",\"edmObject\":\"http://gallica.bnf.fr/ark:/12148/bpt6k509660d/f1.thumbnail\",\"edmProvider\":{\"en\":[\"The European Library\"]},\"edmRights\":{\"def\":[\"http://creativecommons.org/publicdomain/mark/1.0/\"]},\"edmUgc\":\"false\",\"aggregatedCHO\":\"/item/9200408/BibliographicResource_3000117822022\",\"webResources\":[{\"webResourceEdmRights\":{\"def\":[\"http://creativecommons.org/publicdomain/mark/1.0/\"]},\"about\":\"http://www.theeuropeanlibrary.org/tel4/newspapers/issue/3000117822022\",\"textAttributionSnippet\":\"Le Journal des Débats politiques et littéraires - 1940-02-15 - http://europeana.eu/portal/record/9200408/BibliographicResource_3000117822022.html. National Library of France - http://www.theeuropeanlibrary.org/tel4/newspapers/issue/3000117822022. Public Domain - http://creativecommons.org/publicdomain/mark/1.0/\",\"htmlAttributionSnippet\":\"<span about='http://data.europeana.eu/item/9200408/BibliographicResource_3000117822022'><a href='http://europeana.eu/portal/record/9200408/BibliographicResource_3000117822022.html'><span property='dc:title'>Le Journal des Débats politiques et littéraires - 1940-02-15</span></a>. <a href='http://www.theeuropeanlibrary.org/tel4/newspapers/issue/3000117822022'>National Library of France</a>. <a href='http://creativecommons.org/publicdomain/mark/1.0/' rel='xhv:license http://www.europeana.eu/schemas/edm/rights'>Public Domain</a><span rel='cc:useGuidelines' resource='http://www.europeana.eu/rights/pd-usage-guide/'>.</span></span>\"},{\"webResourceEdmRights\":{\"def\":[\"http://creativecommons.org/publicdomain/mark/1.0/\"]},\"about\":\"http://www.theeuropeanlibrary.org/tel4/newspapers/issue/fullscreen/3000117822022\",\"textAttributionSnippet\":\"Le Journal des Débats politiques et littéraires - 1940-02-15 - http://europeana.eu/portal/record/9200408/BibliographicResource_3000117822022.html. National Library of France - http://www.theeuropeanlibrary.org/tel4/newspapers/issue/3000117822022. Public Domain - http://creativecommons.org/publicdomain/mark/1.0/\",\"htmlAttributionSnippet\":\"<span about='http://data.europeana.eu/item/9200408/BibliographicResource_3000117822022'><a href='http://europeana.eu/portal/record/9200408/BibliographicResource_3000117822022.html'><span property='dc:title'>Le Journal des Débats politiques et littéraires - 1940-02-15</span></a>. <a href='http://www.theeuropeanlibrary.org/tel4/newspapers/issue/3000117822022'>National Library of France</a>. <a href='http://creativecommons.org/publicdomain/mark/1.0/' rel='xhv:license http://www.europeana.eu/schemas/edm/rights'>Public Domain</a><span rel='cc:useGuidelines' resource='http://www.europeana.eu/rights/pd-usage-guide/'>.</span></span>\"},{\"webResourceEdmRights\":{\"def\":[\"http://creativecommons.org/publicdomain/mark/1.0/\"]},\"about\":\"http://gallica.bnf.fr/ark:/12148/bpt6k509660d/f1.thumbnail\",\"textAttributionSnippet\":\"Le Journal des Débats politiques et littéraires - 1940-02-15 - http://europeana.eu/portal/record/9200408/BibliographicResource_3000117822022.html. National Library of France - http://www.theeuropeanlibrary.org/tel4/newspapers/issue/3000117822022. Public Domain - http://creativecommons.org/publicdomain/mark/1.0/\",\"htmlAttributionSnippet\":\"<span about='http://data.europeana.eu/item/9200408/BibliographicResource_3000117822022'><a href='http://europeana.eu/portal/record/9200408/BibliographicResource_3000117822022.html'><span property='dc:title'>Le Journal des Débats politiques et littéraires - 1940-02-15</span></a>. <a href='http://www.theeuropeanlibrary.org/tel4/newspapers/issue/3000117822022'>National Library of France</a>. <a href='http://creativecommons.org/publicdomain/mark/1.0/' rel='xhv:license http://www.europeana.eu/schemas/edm/rights'>Public Domain</a><span rel='cc:useGuidelines' resource='http://www.europeana.eu/rights/pd-usage-guide/'>.</span></span>\"}],\"edmPreviewNoDistribute\":false}],\"about\":\"/9200408/BibliographicResource_3000117822022\",\"europeanaAggregation\":{\"about\":\"/aggregation/europeana/9200408/BibliographicResource_3000117822022\",\"aggregatedCHO\":\"/item/9200408/BibliographicResource_3000117822022\",\"edmLandingPage\":\"http://europeana.eu/portal/record/9200408/BibliographicResource_3000117822022.html\",\"edmCountry\":{\"def\":[\"france\"]},\"edmLanguage\":{\"def\":[\"fr\"]},\"edmRights\":{\"def\":[\"http://creativecommons.org/publicdomain/mark/1.0/\"]},\"edmPreview\":\"http://europeanastatic.eu/api/image?uri=http%3A%2F%2Fgallica.bnf.fr%2Fark%3A%2F12148%2Fbpt6k509660d%2Ff1.thumbnail&size=LARGE&type=TEXT\"},\"proxies\":[{\"about\":\"/proxy/provider/9200408/BibliographicResource_3000117822022\",\"dcDate\":{\"def\":[\"1940\"]},\"dcDescription\":{\"def\":[\"1940/02/15 (Numéro 38).\",\"Appartient à l’ensemble documentaire : Pam1\"]},\"dcIdentifier\":{\"def\":[\"http://gallica.bnf.fr/ark:/12148/bpt6k509660d\"]},\"dcLanguage\":{\"def\":[\"fr\"]},\"dcPublisher\":{\"def\":[\"[s.n.] (Paris)\"]},\"dcRelation\":{\"def\":[\"Notice du catalogue : http://catalogue.bnf.fr/ark:/12148/cb39294634r\"]},\"dcRights\":{\"en\":[\"public domain\"],\"fr\":[\"domaine public\"]},\"dcSource\":{\"def\":[\"Bibliothèque nationale de France\",\"http://gallica.bnf.fr/ark:/12148/bpt6k509660d\"]},\"dcTitle\":{\"def\":[\"Le Journal des Débats politiques et littéraires - 1940-02-15\"]},\"dcType\":{\"def\":[\"http://vocab.getty.edu/aat/300026656\",\"Newspaper Issue\"],\"en\":[\"Analytic serial\",\"text\",\"printed serial\"],\"fr\":[\"texte\",\"publication en série imprimée\"]},\"dctermsExtent\":{\"en\":[\"Pages: 4\"]},\"dctermsIsPartOf\":{\"def\":[\"http://data.theeuropeanlibrary.org/BibliographicResource/3000117740032\",\"http://data.theeuropeanlibrary.org/Collection/a0142\",\"http://data.theeuropeanlibrary.org/Collection/a0599\"],\"en\":[\"Europeana Newspapers\"]},\"dctermsIssued\":{\"def\":[\"1940-02-15\"]},\"edmIsNextInSequence\":[\"http://data.theeuropeanlibrary.org/BibliographicResource/3000117821993\"],\"proxyIn\":[\"/aggregation/provider/9200408/BibliographicResource_3000117822022\"],\"proxyFor\":\"/item/9200408/BibliographicResource_3000117822022\",\"edmType\":\"TEXT\",\"europeanaProxy\":false},{\"about\":\"/proxy/europeana/9200408/BibliographicResource_3000117822022\",\"dcDate\":{\"def\":[\"http://semium.org/time/1940\",\"http://semium.org/time/19xx_2_third\"]},\"dctermsTemporal\":{\"def\":[\"http://semium.org/time/19xx\"]},\"proxyIn\":[\"/aggregation/europeana/9200408/BibliographicResource_3000117822022\"],\"proxyFor\":\"/item/9200408/BibliographicResource_3000117822022\",\"edmType\":\"TEXT\",\"year\":{\"def\":[\"1940\"]},\"europeanaProxy\":true}],\"language\":[\"fr\"],\"europeanaCollectionName\":[\"9200408_Ag_EU_TEL_a0599_NewspapersGallica\"],\"providedCHOs\":[{\"about\":\"/item/9200408/BibliographicResource_3000117822022\",\"owlSameAs\":[\"http://data.theeuropeanlibrary.org/BibliographicResource/1000055905723\"]}],\"edmDatasetName\":[\"9200408_Ag_EU_TEL_a0599_NewspapersGallica\"],\"type\":\"TEXT\",\"year\":[\"1940\"],\"timestamp_created_epoch\":1428005167708,\"timestamp_update_epoch\":1428005167708,\"timestamp_created\":\"2015-04-02T20:06:07.708Z\",\"timestamp_update\":\"2015-04-02T20:06:07.708Z\"}}";

    public static final String EXAMPLE_RECORD_MINIMAL_ID = "/x/y";
    public static String EXAMPLE_RECORD_MINIMAL_RESPONSE = "{\"object\": {\"about\":\"/x/y\", \"proxies\":[], \"europeanaAggregation\":{}, \"aggregations\":[] }}";

    public static final String EXAMPLE_FULLTEXT_ID = "/9200396/BibliographicResource_3000118436342";
    public static final String EXAMPLE_FULLTEXT_PAGENR = "1";

    public static String EXAMPLE_FULLTEXT_SUMMARY_RESPONSE = "{\"items\":[{\"id\":\"https://iiif.europeana.eu/presentation/9200396/BibliographicResource_3000118436342/canvas/1\",\"type\":\"Canvas\",\"annotations\":[{\"id\":\"https://iiif.europeana.eu/presentation/9200396/BibliographicResource_3000118436342/annopage/1?lang=fi\",\"type\":\"AnnotationPage\",\"language\":\"fi\"},{\"id\":\"https://iiif.europeana.eu/presentation/9200396/BibliographicResource_3000118436342/annopage/1?lang=se\",\"type\":\"AnnotationPage\",\"language\":\"se\"}]}]}";
    public static final String EXAMPLE_FULLTEXT_SUMMARY_FRAGMENT = "https://iiif.europeana.eu/presentation/9200396/BibliographicResource_3000118436342/annopage/1?lang=fi";
}

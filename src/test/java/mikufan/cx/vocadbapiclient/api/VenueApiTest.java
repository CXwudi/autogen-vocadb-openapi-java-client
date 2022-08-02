/*
 * VocaDbWeb
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package mikufan.cx.vocadbapiclient.api;

import mikufan.cx.vocadbapiclient.model.ContentLanguagePreference;
import mikufan.cx.vocadbapiclient.model.DistanceUnit;
import mikufan.cx.vocadbapiclient.model.NameMatchMode;
import mikufan.cx.vocadbapiclient.model.VenueForApiContractPartialFindResult;
import mikufan.cx.vocadbapiclient.model.VenueOptionalFields;
import mikufan.cx.vocadbapiclient.model.VenueReportType;
import mikufan.cx.vocadbapiclient.model.VenueSortRule;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VenueApi
 */
@Ignore
public class VenueApiTest {

    private final VenueApi api = new VenueApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiVenuesGetTest() {
        String query = null;
        VenueOptionalFields fields = null;
        Integer start = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        NameMatchMode nameMatchMode = null;
        ContentLanguagePreference lang = null;
        VenueSortRule sortRule = null;
        Double latitude = null;
        Double longitude = null;
        Double radius = null;
        DistanceUnit distanceUnit = null;
        VenueForApiContractPartialFindResult response = api.apiVenuesGet(query, fields, start, maxResults, getTotalCount, nameMatchMode, lang, sortRule, latitude, longitude, radius, distanceUnit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiVenuesIdDeleteTest() {
        Integer id = null;
        String notes = null;
        Boolean hardDelete = null;
        api.apiVenuesIdDelete(id, notes, hardDelete);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiVenuesIdReportsPostTest() {
        Integer id = null;
        VenueReportType reportType = null;
        String notes = null;
        Integer versionNumber = null;
        api.apiVenuesIdReportsPost(id, reportType, notes, versionNumber);

        // TODO: test validations
    }
    
}
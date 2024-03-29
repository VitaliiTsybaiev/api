/*
 * API V3
 * Please log in using your email and password in order to use API
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.endpoints;


import com.endpoints.clients.GeozonesApi;
import com.endpoints.models.GeozoneModel;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.endpoints.GsonObjectMapper.gson;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;

/**
 * API tests for GeozonesApi
 */
@Ignore
public class GeozonesApiTest {

    private GeozonesApi api;

    @BeforeClass
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder().setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://api.staging.clearpathgps.com/v3.0"))).geozones();
    }

    /**
     * OK
     */
    @Test
    public void shouldSee200AfterAllGeozonesForAccountIdUsingGET() {
        api.allGeozonesForAccountIdUsingGET().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterAllGeozonesForAccountIdUsingGET() {
        api.allGeozonesForAccountIdUsingGET().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterAllGeozonesForAccountIdUsingGET() {
        api.allGeozonesForAccountIdUsingGET().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Created
     */
    @Test
    public void shouldSee201AfterCreateGeozoneUsingPOST() {
        GeozoneModel geozoneModel = null;
        api.createGeozoneUsingPOST()
                .body(geozoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid JSON
     */
    @Test
    public void shouldSee400AfterCreateGeozoneUsingPOST() {
        GeozoneModel geozoneModel = null;
        api.createGeozoneUsingPOST()
                .body(geozoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterCreateGeozoneUsingPOST() {
        GeozoneModel geozoneModel = null;
        api.createGeozoneUsingPOST()
                .body(geozoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Insufficient privileges
     */
    @Test
    public void shouldSee403AfterCreateGeozoneUsingPOST() {
        GeozoneModel geozoneModel = null;
        api.createGeozoneUsingPOST()
                .body(geozoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Geozone already exists
     */
    @Test
    public void shouldSee409AfterCreateGeozoneUsingPOST() {
        GeozoneModel geozoneModel = null;
        api.createGeozoneUsingPOST()
                .body(geozoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterCreateGeozoneUsingPOST() {
        GeozoneModel geozoneModel = null;
        api.createGeozoneUsingPOST()
                .body(geozoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * No Content
     */
    @Test
    public void shouldSee204AfterDeleteGeozoneUsingDELETE() {
        String geozoneId = null;
        api.deleteGeozoneUsingDELETE()
                .geozoneIdPath(geozoneId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterDeleteGeozoneUsingDELETE() {
        String geozoneId = null;
        api.deleteGeozoneUsingDELETE()
                .geozoneIdPath(geozoneId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Insufficient privileges
     */
    @Test
    public void shouldSee403AfterDeleteGeozoneUsingDELETE() {
        String geozoneId = null;
        api.deleteGeozoneUsingDELETE()
                .geozoneIdPath(geozoneId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterDeleteGeozoneUsingDELETE() {
        String geozoneId = null;
        api.deleteGeozoneUsingDELETE()
                .geozoneIdPath(geozoneId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGeozoneActivityForAccountIdAndUserIdUsingGET() {
        String geozoneId = null;
        Long from = null;
        Long to = null;
        api.geozoneActivityForAccountIdAndUserIdUsingGET()
                .geozoneIdPath(geozoneId)
                .fromQuery(from)
                .toQuery(to).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterGeozoneActivityForAccountIdAndUserIdUsingGET() {
        String geozoneId = null;
        Long from = null;
        Long to = null;
        api.geozoneActivityForAccountIdAndUserIdUsingGET()
                .geozoneIdPath(geozoneId)
                .fromQuery(from)
                .toQuery(to).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterGeozoneActivityForAccountIdAndUserIdUsingGET() {
        String geozoneId = null;
        Long from = null;
        Long to = null;
        api.geozoneActivityForAccountIdAndUserIdUsingGET()
                .geozoneIdPath(geozoneId)
                .fromQuery(from)
                .toQuery(to).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetGeozoneByIdUsingGET() {
        String geozoneId = null;
        api.getGeozoneByIdUsingGET()
                .geozoneIdPath(geozoneId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterGetGeozoneByIdUsingGET() {
        String geozoneId = null;
        api.getGeozoneByIdUsingGET()
                .geozoneIdPath(geozoneId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Access denied
     */
    @Test
    public void shouldSee403AfterGetGeozoneByIdUsingGET() {
        String geozoneId = null;
        api.getGeozoneByIdUsingGET()
                .geozoneIdPath(geozoneId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Geozone not found
     */
    @Test
    public void shouldSee404AfterGetGeozoneByIdUsingGET() {
        String geozoneId = null;
        api.getGeozoneByIdUsingGET()
                .geozoneIdPath(geozoneId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterGetGeozoneByIdUsingGET() {
        String geozoneId = null;
        api.getGeozoneByIdUsingGET()
                .geozoneIdPath(geozoneId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterUpdateGeozoneUsingPUT() {
        GeozoneModel geoZoneModel = null;
        api.updateGeozoneUsingPUT()
                .body(geoZoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid JSON
     */
    @Test
    public void shouldSee400AfterUpdateGeozoneUsingPUT() {
        GeozoneModel geoZoneModel = null;
        api.updateGeozoneUsingPUT()
                .body(geoZoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterUpdateGeozoneUsingPUT() {
        GeozoneModel geoZoneModel = null;
        api.updateGeozoneUsingPUT()
                .body(geoZoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Insufficient privileges
     */
    @Test
    public void shouldSee403AfterUpdateGeozoneUsingPUT() {
        GeozoneModel geoZoneModel = null;
        api.updateGeozoneUsingPUT()
                .body(geoZoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Geozone not found
     */
    @Test
    public void shouldSee404AfterUpdateGeozoneUsingPUT() {
        GeozoneModel geoZoneModel = null;
        api.updateGeozoneUsingPUT()
                .body(geoZoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterUpdateGeozoneUsingPUT() {
        GeozoneModel geoZoneModel = null;
        api.updateGeozoneUsingPUT()
                .body(geoZoneModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
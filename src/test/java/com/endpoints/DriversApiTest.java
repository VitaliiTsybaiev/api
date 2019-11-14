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


import com.endpoints.clients.DriversApi;
import com.endpoints.models.DriverModel;
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
 * API tests for DriversApi
 */
@Ignore
public class DriversApiTest {

    private DriversApi api;

    @BeforeClass
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder().setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://api.staging.clearpathgps.com/v3.0"))).drivers();
    }

    /**
     * OK
     */
    @Test
    public void shouldSee200AfterAllDriversForAccountIdUsingGET() {
        api.allDriversForAccountIdUsingGET().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterAllDriversForAccountIdUsingGET() {
        api.allDriversForAccountIdUsingGET().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterAllDriversForAccountIdUsingGET() {
        api.allDriversForAccountIdUsingGET().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Created
     */
    @Test
    public void shouldSee201AfterCreateDriverUsingPOST() {
        DriverModel driverModel = null;
        api.createDriverUsingPOST()
                .body(driverModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid JSON
     */
    @Test
    public void shouldSee400AfterCreateDriverUsingPOST() {
        DriverModel driverModel = null;
        api.createDriverUsingPOST()
                .body(driverModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterCreateDriverUsingPOST() {
        DriverModel driverModel = null;
        api.createDriverUsingPOST()
                .body(driverModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Insufficient privileges
     */
    @Test
    public void shouldSee403AfterCreateDriverUsingPOST() {
        DriverModel driverModel = null;
        api.createDriverUsingPOST()
                .body(driverModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Driver already exists
     */
    @Test
    public void shouldSee409AfterCreateDriverUsingPOST() {
        DriverModel driverModel = null;
        api.createDriverUsingPOST()
                .body(driverModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterCreateDriverUsingPOST() {
        DriverModel driverModel = null;
        api.createDriverUsingPOST()
                .body(driverModel).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * No Content
     */
    @Test
    public void shouldSee204AfterDeleteDriverUsingDELETE() {
        String driverId = null;
        api.deleteDriverUsingDELETE()
                .driverIdPath(driverId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterDeleteDriverUsingDELETE() {
        String driverId = null;
        api.deleteDriverUsingDELETE()
                .driverIdPath(driverId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Insufficient privileges
     */
    @Test
    public void shouldSee403AfterDeleteDriverUsingDELETE() {
        String driverId = null;
        api.deleteDriverUsingDELETE()
                .driverIdPath(driverId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterDeleteDriverUsingDELETE() {
        String driverId = null;
        api.deleteDriverUsingDELETE()
                .driverIdPath(driverId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterUpdateDriverUsingPUT() {
        DriverModel driver = null;
        api.updateDriverUsingPUT()
                .body(driver).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterUpdateDriverUsingPUT() {
        DriverModel driver = null;
        api.updateDriverUsingPUT()
                .body(driver).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Access denied
     */
    @Test
    public void shouldSee403AfterUpdateDriverUsingPUT() {
        DriverModel driver = null;
        api.updateDriverUsingPUT()
                .body(driver).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Driver not found
     */
    @Test
    public void shouldSee404AfterUpdateDriverUsingPUT() {
        DriverModel driver = null;
        api.updateDriverUsingPUT()
                .body(driver).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Too many requests
     */
    @Test
    public void shouldSee429AfterUpdateDriverUsingPUT() {
        DriverModel driver = null;
        api.updateDriverUsingPUT()
                .body(driver).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
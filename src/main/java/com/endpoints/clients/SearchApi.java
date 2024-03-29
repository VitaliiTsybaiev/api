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


package com.endpoints.clients;

import com.endpoints.models.DeviceCountSearchResult;
import com.endpoints.models.SearchResult;
import com.google.gson.reflect.TypeToken;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static io.restassured.http.Method.*;

public class SearchApi {

    private RequestSpecBuilder reqSpec;

    private SearchApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static SearchApi search(RequestSpecBuilder reqSpec) {
        return new SearchApi(reqSpec);
    }


    public SearchDevicesForDriverUsingGETOper searchDevicesForDriverUsingGET() {
        return new SearchDevicesForDriverUsingGETOper(reqSpec);
    }

    public SearchDevicesUsingGETOper searchDevicesUsingGET() {
        return new SearchDevicesUsingGETOper(reqSpec);
    }

    public SearchDriversUsingGETOper searchDriversUsingGET() {
        return new SearchDriversUsingGETOper(reqSpec);
    }

    public SearchGeozonesUsingGETOper searchGeozonesUsingGET() {
        return new SearchGeozonesUsingGETOper(reqSpec);
    }

    public SearchGroupsUsingGETOper searchGroupsUsingGET() {
        return new SearchGroupsUsingGETOper(reqSpec);
    }

    public SearchUsingGETOper searchUsingGET() {
        return new SearchUsingGETOper(reqSpec);
    }

    /**
    * Customise request specification
    */
    public SearchApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Searches for Devices by DriverID
     * 
     *
     * @see #driverIdPath driverId (required)
     * return List<SearchResult>
     */
    public class SearchDevicesForDriverUsingGETOper {

        public static final String REQ_URI = "/search/devices/{driverId}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public SearchDevicesForDriverUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public SearchDevicesForDriverUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /search/devices/{driverId}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /search/devices/{driverId}
         * @return List<SearchResult>
         */
        public List<SearchResult> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<SearchResult>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param driverId (String) driverId (required)
         */
        public SearchDevicesForDriverUsingGETOper driverIdPath(Object driverId) {
            reqSpec.addPathParam("driverId", driverId);
            return this;
        }

        /**
         * Customise request specification
         */
        public SearchDevicesForDriverUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public SearchDevicesForDriverUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Searches for Devices
     * 
     *
     * @see #searchQuery A string to search for. The minimum length of 3 characters is required to start getting results (required)
     * return List<SearchResult>
     */
    public class SearchDevicesUsingGETOper {

        public static final String REQ_URI = "/search/devices";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public SearchDevicesUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public SearchDevicesUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /search/devices
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /search/devices
         * @return List<SearchResult>
         */
        public List<SearchResult> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<SearchResult>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param search (String) A string to search for. The minimum length of 3 characters is required to start getting results (required)
         */
        public SearchDevicesUsingGETOper searchQuery(Object... search) {
            reqSpec.addQueryParam("search", search);
            return this;
        }

        /**
         * Customise request specification
         */
        public SearchDevicesUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public SearchDevicesUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Searches for Drivers
     * 
     *
     * @see #searchQuery A string to search for. The minimum length of 3 characters is required to start getting results (required)
     * return List<SearchResult>
     */
    public class SearchDriversUsingGETOper {

        public static final String REQ_URI = "/search/drivers";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public SearchDriversUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public SearchDriversUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /search/drivers
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /search/drivers
         * @return List<SearchResult>
         */
        public List<SearchResult> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<SearchResult>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param search (String) A string to search for. The minimum length of 3 characters is required to start getting results (required)
         */
        public SearchDriversUsingGETOper searchQuery(Object... search) {
            reqSpec.addQueryParam("search", search);
            return this;
        }

        /**
         * Customise request specification
         */
        public SearchDriversUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public SearchDriversUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Searches for Geozones
     * 
     *
     * @see #searchQuery A string to search for. The minimum length of 3 characters is required to start getting results (required)
     * return List<SearchResult>
     */
    public class SearchGeozonesUsingGETOper {

        public static final String REQ_URI = "/search/geozones";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public SearchGeozonesUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public SearchGeozonesUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /search/geozones
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /search/geozones
         * @return List<SearchResult>
         */
        public List<SearchResult> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<SearchResult>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param search (String) A string to search for. The minimum length of 3 characters is required to start getting results (required)
         */
        public SearchGeozonesUsingGETOper searchQuery(Object... search) {
            reqSpec.addQueryParam("search", search);
            return this;
        }

        /**
         * Customise request specification
         */
        public SearchGeozonesUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public SearchGeozonesUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Searches for Device Groups
     * 
     *
     * @see #searchQuery A string to search for. The minimum length of 3 characters is required to start getting results (required)
     * return List<DeviceCountSearchResult>
     */
    public class SearchGroupsUsingGETOper {

        public static final String REQ_URI = "/search/groups";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public SearchGroupsUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public SearchGroupsUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /search/groups
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /search/groups
         * @return List<DeviceCountSearchResult>
         */
        public List<DeviceCountSearchResult> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<DeviceCountSearchResult>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param search (String) A string to search for. The minimum length of 3 characters is required to start getting results (required)
         */
        public SearchGroupsUsingGETOper searchQuery(Object... search) {
            reqSpec.addQueryParam("search", search);
            return this;
        }

        /**
         * Customise request specification
         */
        public SearchGroupsUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public SearchGroupsUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Searches for Devices, Device Groups or Geozones
     * 
     *
     * @see #searchQuery A string to search for. The minimum 3 characters is required to start getting results (required)
     * return List<SearchResult>
     */
    public class SearchUsingGETOper {

        public static final String REQ_URI = "/search";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public SearchUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public SearchUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /search
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /search
         * @return List<SearchResult>
         */
        public List<SearchResult> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<SearchResult>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param search (String) A string to search for. The minimum 3 characters is required to start getting results (required)
         */
        public SearchUsingGETOper searchQuery(Object... search) {
            reqSpec.addQueryParam("search", search);
            return this;
        }

        /**
         * Customise request specification
         */
        public SearchUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public SearchUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
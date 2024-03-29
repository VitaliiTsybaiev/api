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

import com.endpoints.models.ReportDescription;
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

public class ReportsApi {

    private RequestSpecBuilder reqSpec;

    private ReportsApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static ReportsApi reports(RequestSpecBuilder reqSpec) {
        return new ReportsApi(reqSpec);
    }


    public GetReportsDescriptionUsingGETOper getReportsDescriptionUsingGET() {
        return new GetReportsDescriptionUsingGETOper(reqSpec);
    }

    public GetReportsUsingGETOper getReportsUsingGET() {
        return new GetReportsUsingGETOper(reqSpec);
    }

    /**
    * Customise request specification
    */
    public ReportsApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Returns detailed description about available reports and their parameters
     * 
     *
     * return List<ReportDescription>
     */
    public class GetReportsDescriptionUsingGETOper {

        public static final String REQ_URI = "/reports/describe";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetReportsDescriptionUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetReportsDescriptionUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /reports/describe
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /reports/describe
         * @return List<ReportDescription>
         */
        public List<ReportDescription> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<ReportDescription>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         */
        public GetReportsDescriptionUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetReportsDescriptionUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Returns a Specific Report
     * 
     *
     * @see #reportGroupQuery Report group to which the requested report belongs (required)
     * @see #reportIdQuery ReportID (required)
     * @see #fromQuery UTC date and time in Epoch seconds or millis. Indicates starting point in time from which to start including data into the report (required)
     * @see #toQuery UTC date and time in Epoch seconds or millis. Indicates ending point in time to which to finish including data into report (required)
     * @see #deviceIdQuery Device ID to generate report for. Only required when the &#39;device.detail&#39; report group is specified (optional)
     * @see #groupIdQuery DeviceGroupID to generate report for. Only required when the &#39;fleet.detail&#39; or &#39;fleet.summary&#39; report group is selected (optional)
     * @see #optionQuery Each report has zero or more available options. See the response of /reports/describe to get detailed description (optional)
     * return String
     */
    public class GetReportsUsingGETOper {

        public static final String REQ_URI = "/reports";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetReportsUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetReportsUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /reports
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /reports
         * @return String
         */
        public String executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<String>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param reportGroup (String) Report group to which the requested report belongs (required)
         */
        public GetReportsUsingGETOper reportGroupQuery(Object... reportGroup) {
            reqSpec.addQueryParam("report_group", reportGroup);
            return this;
        }

        /**
         * @param reportId (String) ReportID (required)
         */
        public GetReportsUsingGETOper reportIdQuery(Object... reportId) {
            reqSpec.addQueryParam("report_id", reportId);
            return this;
        }

        /**
         * @param deviceId (String) Device ID to generate report for. Only required when the &#39;device.detail&#39; report group is specified (optional)
         */
        public GetReportsUsingGETOper deviceIdQuery(Object... deviceId) {
            reqSpec.addQueryParam("device_id", deviceId);
            return this;
        }

        /**
         * @param groupId (String) DeviceGroupID to generate report for. Only required when the &#39;fleet.detail&#39; or &#39;fleet.summary&#39; report group is selected (optional)
         */
        public GetReportsUsingGETOper groupIdQuery(Object... groupId) {
            reqSpec.addQueryParam("group_id", groupId);
            return this;
        }

        /**
         * @param option (String) Each report has zero or more available options. See the response of /reports/describe to get detailed description (optional)
         */
        public GetReportsUsingGETOper optionQuery(Object... option) {
            reqSpec.addQueryParam("option", option);
            return this;
        }

        /**
         * @param from (Long) UTC date and time in Epoch seconds or millis. Indicates starting point in time from which to start including data into the report (required)
         */
        public GetReportsUsingGETOper fromQuery(Object... from) {
            reqSpec.addQueryParam("from", from);
            return this;
        }

        /**
         * @param to (Long) UTC date and time in Epoch seconds or millis. Indicates ending point in time to which to finish including data into report (required)
         */
        public GetReportsUsingGETOper toQuery(Object... to) {
            reqSpec.addQueryParam("to", to);
            return this;
        }

        /**
         * Customise request specification
         */
        public GetReportsUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetReportsUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
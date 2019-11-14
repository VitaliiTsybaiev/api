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

import com.endpoints.models.EventDataSetModel;
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

public class EventsApi {

    private RequestSpecBuilder reqSpec;

    private EventsApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static EventsApi events(RequestSpecBuilder reqSpec) {
        return new EventsApi(reqSpec);
    }


    public GetDeviceEventsUsingGETOper getDeviceEventsUsingGET() {
        return new GetDeviceEventsUsingGETOper(reqSpec);
    }

    public GetLastDeviceEventUsingGETOper getLastDeviceEventUsingGET() {
        return new GetLastDeviceEventUsingGETOper(reqSpec);
    }

    public GetLastFleetEventsUsingGETOper getLastFleetEventsUsingGET() {
        return new GetLastFleetEventsUsingGETOper(reqSpec);
    }

    public GetLastGroupEventsUsingGETOper getLastGroupEventsUsingGET() {
        return new GetLastGroupEventsUsingGETOper(reqSpec);
    }

    /**
    * Customise request specification
    */
    public EventsApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Returns Events of a Device. The maximum of 1000 Events can be returned
     * 
     *
     * @see #deviceIdPath Device ID for which to return Events (required)
     * @see #fromQuery UTC date and time in Epoch seconds or millis. Indicates a starting point in time from which to gather Events (optional)
     * @see #toQuery UTC date and time in Epoch seconds or millis. Indicates an ending point in time up to which to gather Events (optional)
     * @see #limitQuery Indicates the number of how many Events should be returned for each device (optional)
     * @see #limitTypeQuery This parameter specifies whether the resulting set of events should be limited from the beginning or the end before it is returned to the caller in ascending order if the response exceeds the requested limit or 1000 events (optional, default to last)
     * return EventDataSetModel
     */
    public class GetDeviceEventsUsingGETOper {

        public static final String REQ_URI = "/events/device/{deviceId}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetDeviceEventsUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetDeviceEventsUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /events/device/{deviceId}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /events/device/{deviceId}
         * @return EventDataSetModel
         */
        public EventDataSetModel executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<EventDataSetModel>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param deviceId (String) Device ID for which to return Events (required)
         */
        public GetDeviceEventsUsingGETOper deviceIdPath(Object deviceId) {
            reqSpec.addPathParam("deviceId", deviceId);
            return this;
        }

        /**
         * @param from (Long) UTC date and time in Epoch seconds or millis. Indicates a starting point in time from which to gather Events (optional)
         */
        public GetDeviceEventsUsingGETOper fromQuery(Object... from) {
            reqSpec.addQueryParam("from", from);
            return this;
        }

        /**
         * @param to (Long) UTC date and time in Epoch seconds or millis. Indicates an ending point in time up to which to gather Events (optional)
         */
        public GetDeviceEventsUsingGETOper toQuery(Object... to) {
            reqSpec.addQueryParam("to", to);
            return this;
        }

        /**
         * @param limit (Integer) Indicates the number of how many Events should be returned for each device (optional)
         */
        public GetDeviceEventsUsingGETOper limitQuery(Object... limit) {
            reqSpec.addQueryParam("limit", limit);
            return this;
        }

        /**
         * @param limitType (String) This parameter specifies whether the resulting set of events should be limited from the beginning or the end before it is returned to the caller in ascending order if the response exceeds the requested limit or 1000 events (optional, default to last)
         */
        public GetDeviceEventsUsingGETOper limitTypeQuery(Object... limitType) {
            reqSpec.addQueryParam("limitType", limitType);
            return this;
        }

        /**
         * Customise request specification
         */
        public GetDeviceEventsUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetDeviceEventsUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Returns the last Event for a Device
     * 
     *
     * @see #deviceIdPath Device ID for which to return the last Event (required)
     * @see #toQuery UTC date and time in Epoch seconds or millis. Indicates ending point in time up to which to get the last Event (optional)
     * return EventDataSetModel
     */
    public class GetLastDeviceEventUsingGETOper {

        public static final String REQ_URI = "/events/device/{deviceId}/latest";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetLastDeviceEventUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetLastDeviceEventUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /events/device/{deviceId}/latest
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /events/device/{deviceId}/latest
         * @return EventDataSetModel
         */
        public EventDataSetModel executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<EventDataSetModel>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param deviceId (String) Device ID for which to return the last Event (required)
         */
        public GetLastDeviceEventUsingGETOper deviceIdPath(Object deviceId) {
            reqSpec.addPathParam("deviceId", deviceId);
            return this;
        }

        /**
         * @param to (Long) UTC date and time in Epoch seconds or millis. Indicates ending point in time up to which to get the last Event (optional)
         */
        public GetLastDeviceEventUsingGETOper toQuery(Object... to) {
            reqSpec.addQueryParam("to", to);
            return this;
        }

        /**
         * Customise request specification
         */
        public GetLastDeviceEventUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetLastDeviceEventUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Returns the last Event for each Device from all Device Groups available for the current User. The Maximum of 1000 Events can be returned
     * 
     *
     * @see #toQuery UTC date and time in Epoch seconds or millis. Indicates an ending point in time up to which to get last Events (optional)
     * @see #includeInactiveQuery Indicates whether inactive devices should be included into response (optional, default to false)
     * return List<EventDataSetModel>
     */
    public class GetLastFleetEventsUsingGETOper {

        public static final String REQ_URI = "/events/fleet/latest";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetLastFleetEventsUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetLastFleetEventsUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /events/fleet/latest
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /events/fleet/latest
         * @return List<EventDataSetModel>
         */
        public List<EventDataSetModel> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<EventDataSetModel>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param to (Long) UTC date and time in Epoch seconds or millis. Indicates an ending point in time up to which to get last Events (optional)
         */
        public GetLastFleetEventsUsingGETOper toQuery(Object... to) {
            reqSpec.addQueryParam("to", to);
            return this;
        }

        /**
         * @param includeInactive (Boolean) Indicates whether inactive devices should be included into response (optional, default to false)
         */
        public GetLastFleetEventsUsingGETOper includeInactiveQuery(Object... includeInactive) {
            reqSpec.addQueryParam("includeInactive", includeInactive);
            return this;
        }

        /**
         * Customise request specification
         */
        public GetLastFleetEventsUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetLastFleetEventsUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Returns last Events for each Device withing a Device Group
     * 
     *
     * @see #groupIdPath Last Events for all Devices belonging to the specified Device Group ID are returned (required)
     * @see #toQuery UTC date and time in Epoch seconds or millis. Indicates an ending point in time up to which to get last Events (optional)
     * @see #includeInactiveQuery Indicates whether inactive devices should be included into response (optional, default to false)
     * return List<EventDataSetModel>
     */
    public class GetLastGroupEventsUsingGETOper {

        public static final String REQ_URI = "/events/fleet/{groupId}/latest";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetLastGroupEventsUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetLastGroupEventsUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /events/fleet/{groupId}/latest
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /events/fleet/{groupId}/latest
         * @return List<EventDataSetModel>
         */
        public List<EventDataSetModel> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<EventDataSetModel>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param groupId (String) Last Events for all Devices belonging to the specified Device Group ID are returned (required)
         */
        public GetLastGroupEventsUsingGETOper groupIdPath(Object groupId) {
            reqSpec.addPathParam("groupId", groupId);
            return this;
        }

        /**
         * @param to (Long) UTC date and time in Epoch seconds or millis. Indicates an ending point in time up to which to get last Events (optional)
         */
        public GetLastGroupEventsUsingGETOper toQuery(Object... to) {
            reqSpec.addQueryParam("to", to);
            return this;
        }

        /**
         * @param includeInactive (Boolean) Indicates whether inactive devices should be included into response (optional, default to false)
         */
        public GetLastGroupEventsUsingGETOper includeInactiveQuery(Object... includeInactive) {
            reqSpec.addQueryParam("includeInactive", includeInactive);
            return this;
        }

        /**
         * Customise request specification
         */
        public GetLastGroupEventsUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetLastGroupEventsUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
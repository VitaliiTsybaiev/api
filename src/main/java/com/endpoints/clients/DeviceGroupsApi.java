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

import com.endpoints.models.CreateUpdateDeviceGroupModel;
import com.endpoints.models.DeviceGroupModel;
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

public class DeviceGroupsApi {

    private RequestSpecBuilder reqSpec;

    private DeviceGroupsApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static DeviceGroupsApi deviceGroups(RequestSpecBuilder reqSpec) {
        return new DeviceGroupsApi(reqSpec);
    }


    public AllDeviceGroupsForAccountIdUsingGETOper allDeviceGroupsForAccountIdUsingGET() {
        return new AllDeviceGroupsForAccountIdUsingGETOper(reqSpec);
    }

    public CreateDeviceGroupUsingPOSTOper createDeviceGroupUsingPOST() {
        return new CreateDeviceGroupUsingPOSTOper(reqSpec);
    }

    public DeleteDeviceGroupUsingDELETEOper deleteDeviceGroupUsingDELETE() {
        return new DeleteDeviceGroupUsingDELETEOper(reqSpec);
    }

    public GetDeviceGroupUsingGETOper getDeviceGroupUsingGET() {
        return new GetDeviceGroupUsingGETOper(reqSpec);
    }

    public UpdateDeviceGroupUsingPUTOper updateDeviceGroupUsingPUT() {
        return new UpdateDeviceGroupUsingPUTOper(reqSpec);
    }

    /**
     * Customise request specification
     */
    public DeviceGroupsApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Returns all Device Groups available for the current User
     * <p>
     * <p>
     * return List<DeviceGroupModel>
     */
    public class AllDeviceGroupsForAccountIdUsingGETOper {

        public static final String REQ_URI = "/groups/all";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public AllDeviceGroupsForAccountIdUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public AllDeviceGroupsForAccountIdUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /groups/all
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /groups/all
         *
         * @return List<DeviceGroupModel>
         */
        public List<DeviceGroupModel> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<DeviceGroupModel>>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         */
        public AllDeviceGroupsForAccountIdUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public AllDeviceGroupsForAccountIdUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }

    /**
     * Creates a new Device Group
     *
     * @see #body JSON representation of a Device Group to be created (required)
     * return DeviceGroupModel
     */
    public class CreateDeviceGroupUsingPOSTOper {

        public static final String REQ_URI = "/groups/create";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public CreateDeviceGroupUsingPOSTOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public CreateDeviceGroupUsingPOSTOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /groups/create
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        /**
         * POST /groups/create
         *
         * @return DeviceGroupModel
         */
        public DeviceGroupModel executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<DeviceGroupModel>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * @param deviceGroupModel (CreateUpdateDeviceGroupModel) JSON representation of a Device Group to be created (required)
         */
        public CreateDeviceGroupUsingPOSTOper body(CreateUpdateDeviceGroupModel deviceGroupModel) {
            reqSpec.setBody(deviceGroupModel);
            return this;
        }

        /**
         * Customise request specification
         */
        public CreateDeviceGroupUsingPOSTOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public CreateDeviceGroupUsingPOSTOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }

    /**
     * Deletes a Device Group
     *
     * @see #groupIdPath ID of a Device Group to be deleted (required)
     */
    public class DeleteDeviceGroupUsingDELETEOper {

        public static final String REQ_URI = "/groups/delete/{groupId}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public DeleteDeviceGroupUsingDELETEOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        public DeleteDeviceGroupUsingDELETEOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("*/*");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /groups/delete/{groupId}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(DELETE, REQ_URI));
        }

        /**
         * @param groupId (String) ID of a Device Group to be deleted (required)
         */
        public DeleteDeviceGroupUsingDELETEOper groupIdPath(Object groupId) {
            reqSpec.addPathParam("groupId", groupId);
            return this;
        }

        /**
         * Customise request specification
         */
        public DeleteDeviceGroupUsingDELETEOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public DeleteDeviceGroupUsingDELETEOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }

    /**
     * Returns a Device Group by its ID
     *
     * @see #groupIdPath Device Group ID (required)
     * return DeviceGroupModel
     */
    public class GetDeviceGroupUsingGETOper {

        public static final String REQ_URI = "/groups/{groupId}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetDeviceGroupUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetDeviceGroupUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /groups/{groupId}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /groups/{groupId}
         *
         * @return DeviceGroupModel
         */
        public DeviceGroupModel executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<DeviceGroupModel>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * @param groupId (String) Device Group ID (required)
         */
        public GetDeviceGroupUsingGETOper groupIdPath(Object groupId) {
            reqSpec.addPathParam("groupId", groupId);
            return this;
        }

        /**
         * Customise request specification
         */
        public GetDeviceGroupUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetDeviceGroupUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }

    /**
     * Updates a Device Group
     *
     * @see #body JSON representation of a Device Group to be updated (required)
     * return DeviceGroupModel
     */
    public class UpdateDeviceGroupUsingPUTOper {

        public static final String REQ_URI = "/groups/update";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public UpdateDeviceGroupUsingPUTOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public UpdateDeviceGroupUsingPUTOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /groups/update
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(PUT, REQ_URI));
        }

        /**
         * PUT /groups/update
         *
         * @return DeviceGroupModel
         */
        public DeviceGroupModel executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<DeviceGroupModel>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * @param deviceGroupModel (CreateUpdateDeviceGroupModel) JSON representation of a Device Group to be updated (required)
         */
        public UpdateDeviceGroupUsingPUTOper body(CreateUpdateDeviceGroupModel deviceGroupModel) {
            reqSpec.setBody(deviceGroupModel);
            return this;
        }

        /**
         * Customise request specification
         */
        public UpdateDeviceGroupUsingPUTOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public UpdateDeviceGroupUsingPUTOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
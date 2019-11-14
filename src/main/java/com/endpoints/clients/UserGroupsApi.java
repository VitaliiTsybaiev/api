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

import com.endpoints.models.GroupList;
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

public class UserGroupsApi {

    private RequestSpecBuilder reqSpec;

    private UserGroupsApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static UserGroupsApi userGroups(RequestSpecBuilder reqSpec) {
        return new UserGroupsApi(reqSpec);
    }


    public GetGroupsByUserIdUsingGETOper getGroupsByUserIdUsingGET() {
        return new GetGroupsByUserIdUsingGETOper(reqSpec);
    }

    /**
    * Customise request specification
    */
    public UserGroupsApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Returns all Groups for specified User ID
     * 
     *
     * @see #userIdPath userId (required)
     * return List<GroupList>
     */
    public class GetGroupsByUserIdUsingGETOper {

        public static final String REQ_URI = "/users/groups/{userId}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetGroupsByUserIdUsingGETOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetGroupsByUserIdUsingGETOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /users/groups/{userId}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /users/groups/{userId}
         * @return List<GroupList>
         */
        public List<GroupList> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<GroupList>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * @param userId (String) userId (required)
         */
        public GetGroupsByUserIdUsingGETOper userIdPath(Object userId) {
            reqSpec.addPathParam("userId", userId);
            return this;
        }

        /**
         * Customise request specification
         */
        public GetGroupsByUserIdUsingGETOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetGroupsByUserIdUsingGETOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
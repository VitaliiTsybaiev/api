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

import com.google.gson.reflect.TypeToken;
import com.endpoints.models.JwtAuthModel;
import com.endpoints.models.JwtModel;
import com.endpoints.models.RefreshTokenRequestModel;

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

import com.endpoints.JSON;

import static io.restassured.http.Method.*;

public class JwtAuthenticationApi {

    private RequestSpecBuilder reqSpec;

    private JwtAuthenticationApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static JwtAuthenticationApi jwtAuthentication(RequestSpecBuilder reqSpec) {
        return new JwtAuthenticationApi(reqSpec);
    }


    public AuthenticateWithTokenUsingPOSTOper authenticateWithTokenUsingPOST() {
        return new AuthenticateWithTokenUsingPOSTOper(reqSpec);
    }

    public RefreshAuthTokenUsingPOSTOper refreshAuthTokenUsingPOST() {
        return new RefreshAuthTokenUsingPOSTOper(reqSpec);
    }

    /**
     * Customise request specification
     */
    public JwtAuthenticationApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Generates a JSON Web Token to used as &#39;Authorization: Bearer token_value&#39; header
     * Send JSON {\&quot;emailId\&quot;:\&quot;value\&quot;, \&quot;password\&quot;:\&quot;value\&quot;} in POST body.
     *
     * @see #body model (required)
     * return JwtModel
     */
    public class AuthenticateWithTokenUsingPOSTOper {

        public static final String REQ_URI = "/auth/token";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public AuthenticateWithTokenUsingPOSTOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public AuthenticateWithTokenUsingPOSTOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /auth/token
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        /**
         * POST /auth/token
         *
         * @return JwtModel
         */
        public JwtModel executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<JwtModel>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * @param model (JwtAuthModel) model (required)
         */
        public AuthenticateWithTokenUsingPOSTOper body(JwtAuthModel model) {
            reqSpec.setBody(model);
            return this;
        }

        /**
         * Customise request specification
         */
        public AuthenticateWithTokenUsingPOSTOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public AuthenticateWithTokenUsingPOSTOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }

    /**
     * Refresh a JSON Web Token that used as &#39;Authorization: Bearer token_value&#39; header
     *
     * @see #body requestModel (required)
     * return JwtModel
     */
    public class RefreshAuthTokenUsingPOSTOper {

        public static final String REQ_URI = "/auth/refresh";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public RefreshAuthTokenUsingPOSTOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public RefreshAuthTokenUsingPOSTOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /auth/refresh
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        /**
         * POST /auth/refresh
         *
         * @return JwtModel
         */
        public JwtModel executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<JwtModel>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * @param requestModel (RefreshTokenRequestModel) requestModel (required)
         */
        public RefreshAuthTokenUsingPOSTOper body(RefreshTokenRequestModel requestModel) {
            reqSpec.setBody(requestModel);
            return this;
        }

        /**
         * Customise request specification
         */
        public RefreshAuthTokenUsingPOSTOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public RefreshAuthTokenUsingPOSTOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
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

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import java.util.function.Function;

public class ResponseSpecBuilders {

    private ResponseSpecBuilders() {
    }

    public static Function<Response, Response> validatedWith(ResponseSpecification respSpec) {
        return response -> response.then().spec(respSpec).extract().response();
    }

    public static Function<Response, Response> validatedWith(ResponseSpecBuilder respSpec) {
        return validatedWith(respSpec.build());
    }

    /**
     * @param code expected status code
     * @return ResponseSpecBuilder
     */
    public static ResponseSpecBuilder shouldBeCode(int code) {
        return new ResponseSpecBuilder().expectStatusCode(code);
    }
}
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

import com.endpoints.clients.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ApiClient {

    private final Config config;

    private ApiClient(Config config) {
        this.config = config;
    }

    public static ApiClient api(Config config) {
        return new ApiClient(config);
    }

    public DeviceGroupsApi deviceGroups() {
        return DeviceGroupsApi.deviceGroups(config.baseReqSpec.get());
    }

    public DevicesApi devices() {
        return DevicesApi.devices(config.baseReqSpec.get());
    }

    public DriversApi drivers() {
        return DriversApi.drivers(config.baseReqSpec.get());
    }

    public EventsApi events() {
        return EventsApi.events(config.baseReqSpec.get());
    }

    public GeozonesApi geozones() {
        return GeozonesApi.geozones(config.baseReqSpec.get());
    }

    public JwtAuthenticationApi jwtAuthentication() {
        return JwtAuthenticationApi.jwtAuthentication(config.baseReqSpec.get());
    }

    public PasswordRecoveryApi passwordRecovery() {
        return PasswordRecoveryApi.passwordRecovery(config.baseReqSpec.get());
    }

    public ReportsApi reports() {
        return ReportsApi.reports(config.baseReqSpec.get());
    }

    public SearchApi search() {
        return SearchApi.search(config.baseReqSpec.get());
    }

    public UserGroupsApi userGroups() {
        return UserGroupsApi.userGroups(config.baseReqSpec.get());
    }

    public UsersApi users() {
        return UsersApi.users(config.baseReqSpec.get());
    }

    public static class Config {
        private Supplier<RequestSpecBuilder> baseReqSpec;

        /**
         * Use common specification for all operations
         */
        public Config reqSpecSupplier(Supplier<RequestSpecBuilder> supplier) {
            this.baseReqSpec = supplier;
            return this;
        }

        public static Config apiConfig() {
            return new Config();
        }
    }
}
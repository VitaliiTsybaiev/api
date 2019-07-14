package com.eug.steps.api;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;

import static io.restassured.RestAssured.given;

@Log4j2
public class GoogleSteps {

    @Step
    public Response getGooglePage(){
        log.info("Getting google page");
        return given()
                .when()
                .get("https://google.com")
                .then()
                .statusCode(200)
                .extract().response();
    }
}

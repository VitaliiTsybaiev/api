package com.eug.steps.api;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GoogleSteps {

    @Step
    public Response getGooglePage(){
        return given()
                .filter(new AllureRestAssured())
                .log().all()
                .when()
                .get("https://google.com")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }
}

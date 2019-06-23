package com.eug;

import com.eug.steps.api.GoogleSteps;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class RestAssurTest {

    private GoogleSteps steps = new GoogleSteps();

    @Test
    public void demoTest(){
        assertEquals("aaa", "aaa");
    }

    @Test
    public void demoRestAssured(){

        Response googlePage = steps.getGooglePage();

        assertEquals("aaa", "aaa");
    }
}

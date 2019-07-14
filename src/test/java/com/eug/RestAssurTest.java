package com.eug;

import com.eug.steps.api.GoogleSteps;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RestAssurTest extends BaseApiTest {

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

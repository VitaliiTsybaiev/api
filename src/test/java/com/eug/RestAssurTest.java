package com.eug;

import com.eug.models.User;
import com.eug.steps.api.GoogleSteps;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

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

    @Test
    public void jacksonDateSerializeTest(){

        User someUser = User.builder()
                .name("SomeName")
                .age(39)
                .joinDateTime(LocalDateTime.now())
                .build();

        steps.sendPost(someUser);

    }
}

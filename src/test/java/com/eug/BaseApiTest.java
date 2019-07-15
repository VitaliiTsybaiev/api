package com.eug;


import com.eug.listeners.TestListener;
import com.eug.utils.ConfigProperties;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseApiTest {

    @BeforeSuite(description = "Setting base URI")
    public void setBaseUri(){
        RestAssured.baseURI = ConfigProperties.getProperty("baseUrl"); // "https://fakerestapi.azurewebsites.net/api/";
    }
}

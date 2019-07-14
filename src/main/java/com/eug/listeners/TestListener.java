package com.eug.listeners;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import lombok.extern.log4j.Log4j2;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


@Log4j2
public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
//        System.setOut(
//                IoBuilder.forLogger(LogManager.getLogger("system.out"))
//                        .setLevel(Level.INFO)
//                        .buildPrintStream()
//        );

        RestAssured.config = RestAssured.config().objectMapperConfig(ObjectMapperConfig.objectMapperConfig()
                .jackson2ObjectMapperFactory((cls, charset) -> {
                    ObjectMapper objectMapper = new ObjectMapper();
                    objectMapper.registerModule(new JavaTimeModule());
                    objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
                    return objectMapper;
                })
        );


        RestAssured.filters(new AllureRestAssured(),
                new RequestLoggingFilter(),
                new ResponseLoggingFilter());

    }


    @Override
    public void onTestStart(ITestResult result) {
        log.info(result.getMethod().getMethodName() + " STARTED");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info(result.getMethod().getMethodName() + " PASSED");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.info(result.getMethod().getMethodName() + " FAILED");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.info(result.getMethod().getMethodName() + " SKIPPED");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        log.info(result.getMethod().getMethodName() +
                " FAILED_BUT_WITHIN_SUCCESS_PERCENTAGE");

    }

    @Override
    public void onFinish(ITestContext context) {
        log.info("FINISHED");

    }
}

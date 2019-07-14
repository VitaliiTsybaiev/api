package com.eug.listeners;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
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

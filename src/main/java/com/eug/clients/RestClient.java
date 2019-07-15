package com.eug.clients;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class RestClient<T> {

    protected abstract T getType();

    private Response response;

    @Step("Verify status code")
    public T verifyStatusCode(int expectedStatusCode){
        response.then().assertThat().statusCode(expectedStatusCode);
        return getType();
    }

}

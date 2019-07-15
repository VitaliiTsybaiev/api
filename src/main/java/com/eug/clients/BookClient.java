package com.eug.clients;

import com.eug.models.Book;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;


public class BookClient extends RestClient<BookClient> {

    private static final String BOOK_END_PONT = "/books";

    @Override
    protected BookClient getType() {
        return this;
    }

    @Step("Create book")
    public BookClient createBook(Book book){
        setResponse(given().contentType(ContentType.JSON).body(book).post(BOOK_END_PONT));
        return this;
    }

    @Step("Get book")
    public BookClient getBook(int id){
        setResponse(given().pathParam("id", id).get(BOOK_END_PONT + "/{id}"));
        return this;
    }

    @Step("Get books")
    public BookClient getBooks(){
        setResponse(given().get(BOOK_END_PONT));
        return this;
    }
}

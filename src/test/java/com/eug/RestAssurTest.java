package com.eug;

import com.eug.clients.BookClient;
import com.eug.clients.RestClient;
import com.eug.models.Book;
import com.eug.models.User;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.Assert.assertEquals;

public class RestAssurTest extends BaseApiTest {

//    private GoogleSteps steps = new GoogleSteps();

//    @Test
//    public void demoTest(){
//        assertEquals("aaa", "aaa");
//    }
//
//    @Test
//    public void demoRestAssured(){
//
//        Response googlePage = steps.getGooglePage();
//
//        assertEquals("aaa", "aaa");
//    }
//
//    @Test
//    public void jacksonDateSerializeTest(){
//
//        User someUser = User.builder()
//                .name("SomeName")
//                .age(39)
//                .joinDateTime(LocalDateTime.now())
//                .build();
//
//        steps.sendPost(someUser);
//
//    }


    @Test
    public void verifyThatBookCanBeCreated(){
        Book book = Book.builder().build();
        new BookClient()
                .createBook(book)
                .verifyStatusCode(HttpStatus.SC_OK);
    }
    @Test
    public void verifyThatBookCanBeRetrievedById(){
        new BookClient()
                .getBook(1)
                .verifyStatusCode(HttpStatus.SC_OK)
                .getResponse().body().as(Book.class);
    }

    @Test
    public void verifyThatBooksListCanBeRetrieved(){
        new BookClient()
                .getBooks()
                .verifyStatusCode(HttpStatus.SC_OK)
                .getResponse().body().as(Book[].class);
    }
}

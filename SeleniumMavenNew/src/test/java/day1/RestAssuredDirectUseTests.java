package day1;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredDirectUseTests {

    @Test
    public void test1() {
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("content-type"));
        int expStatusCode = response.statusCode();
        Assert.assertEquals(expStatusCode,200);

    }
    @Test
    public void test2(){
        baseURI = "https://reqres.in/api";
        //given().get("/users?page=2").then().statusCode(200);

        given().
                get("/users?page=2").
        then().
            statusCode(200).
            body("data[3].id",equalTo(10)).
            log().all();

    }
}

package day1;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class PutPatchDeleteTestRestAssured {

    @Test
    public void testPut() {
        Map<String, Object> map = new HashMap<String, Object>();

        JSONObject request = new JSONObject();
        request.put("name", "shashi");
        request.put("job", "learner");
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";
        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("/users/2").
                then().
                statusCode(200)
                .log().all();
    }

    @Test
    public void testPatch() {
        Map<String, Object> map = new HashMap<String, Object>();

        JSONObject request = new JSONObject();
        request.put("name", "shashi");
        request.put("job", "learner");
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";
        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("/users/2").
                then().
                statusCode(200)
                .log().all();
    }

    @Test
    public void testDelete() {
        Map<String, Object> map = new HashMap<String, Object>();

        JSONObject request = new JSONObject();
        request.put("name", "shashi");
        request.put("job", "learner");
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";
        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
                when().
                delete("/users/2").
                then().
                statusCode(204)
                .log().all();
    }

    @Test
    public void testDeleteOptimizedCode() {
        Map<String, Object> map = new HashMap<String, Object>();

        JSONObject request = new JSONObject();
        request.put("name", "shashi");
        request.put("job", "learner");
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";
        when().
                delete("/users/2").
                then().
                statusCode(204).
                log().all();
    }

}

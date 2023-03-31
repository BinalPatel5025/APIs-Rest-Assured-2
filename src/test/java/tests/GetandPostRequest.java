package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class GetandPostRequest {
	
	//@Test
	public void testGet() {
		baseURI = "https://reqres.in/";
		given().
			get("/api/users?page=2")
		.then().
			statusCode(200).
			body("data[5].first_name", equalTo("Rachel")).
			body("data.first_name", hasItems("Michael","Lindsay"));
			
	}
	@Test
	public void testPost() {
	
	 Map<String , Object> map = new HashMap<String , Object>(); map.put("name",
		 "Binal"); map.put("job", "Anisha"); System.out.println(map);
		 
		
//		JSONObject req = new JSONObject();
//		req.put("name", "Binal");
//		req.put("job", "Anisha");
		
		baseURI = "https://reqres.in/";
		given().
			header("content-type","appliaction/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			//body(req.toJSONString()).
			body(map).
		when().
			post("/api/users").
		then().
			statusCode(201).
			log().all();
	}
}

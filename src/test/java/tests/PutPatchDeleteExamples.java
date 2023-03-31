package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class PutPatchDeleteExamples {

	@Test
	public void testPut() {
		
		
		JSONObject req = new JSONObject();
		req.put("name", "Binal");
		req.put("job", "Cashier");
		
		baseURI = "https://reqres.in";
		given().
			header("content-type","appliaction/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(req.toJSONString()).
		when().
			put("/api/users/2").
		then().
			statusCode(200).
			log().all();
	}
	
	@Test
	public void testDelete() {
		baseURI = "https://reqres.in";

		when().
			delete("/api/users/2").
		then().
			statusCode(204).
			log().all();
	}
}

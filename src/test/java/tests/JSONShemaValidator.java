package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;



public class JSONShemaValidator {

	@Test
		public void testGet() {
			baseURI = "https://reqres.in/";
			given().
				get("/api/users?page=2")
			.then().
				assertThat().
				body(JsonSchemaValidator.
				matchesJsonSchema(new File("./target/schema1.json"))).
				statusCode(200);
				
				
		}
}

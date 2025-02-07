package Activitiy;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class Activity1 {
	String baseURI= "https://petstore.swagger.io/v2/pet";
  @Test(priority = 1)
  public void addpet() {
	  
	  Map<String, Object> body= new HashMap<>();
	  body.put("id", 772329);
	  body.put("name", "Riley");
	  body.put("status", "alive");
	
	  Response res=given().baseUri(baseURI).header("Content-Type", "application/json").body(body).when().post();
	  res.then().body("id", equalTo(772329));
  }
  
  @Test(priority = 2)
  public void getpet() {
	  Response response = given().baseUri(baseURI).header("Content-Type", "application/json").when().pathParam("petId", 772329)
	  .get("/{petId}"); 
	  
	// Assertion
	response.then().body("id", equalTo(772329));
	response.then().body("name", equalTo("Riley"));
	response.then().body("status", equalTo("alive"));
}

@Test(priority = 3)
public void deletePet() {
	Response response = given()
		.baseUri("https://petstore.swagger.io/v2/pet") // Set base URI
		.header("Content-Type", "application/json") // Set headers
		.when().pathParam("petId", 772329) // Set path parameter
		.delete("/{petId}"); // Send DELETE request

	// Assertion
	response.then().body("code", equalTo(200));
	response.then().body("message", equalTo("772329"));
}
}
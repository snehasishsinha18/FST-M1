package Activitiy;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GitHub_Project {
    
    private static RequestSpecification requestSpec;
    private static final String GITHUB_TOKEN = "your_github_access_token";
    private static final String SSH_KEY = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAg....";
    private static int sshKeyId;

    @BeforeClass
    public void setup() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.github.com")
                .addHeader("Authorization", "token " + GITHUB_TOKEN)
                .setContentType("application/json")
                .build();
    }

    @Test(priority = 1)
    public void testAddSSHKey() {
        String requestBody = "{"title": "TestAPIKey", "key": "" + SSH_KEY + ""}";
        
        Response response = given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .post("/user/keys");
        
        response.then().statusCode(201);
        sshKeyId = response.jsonPath().getInt("id");
        Assert.assertNotEquals(sshKeyId, 0);
        Reporter.log("SSH Key added with ID: " + sshKeyId, true);
    }

    @Test(priority = 2)
    public void testGetSSHKey() {
        Response response = given()
                .spec(requestSpec)
                .pathParam("keyId", sshKeyId)
                .when()
                .get("/user/keys/{keyId}");
        
        response.then().statusCode(200);
        Reporter.log("Response: " + response.asString(), true);
    }

    @Test(priority = 3)
    public void testDeleteSSHKey() {
        Response response = given()
                .spec(requestSpec)
                .pathParam("keyId", sshKeyId)
                .when()
                .delete("/user/keys/{keyId}");
        
        response.then().statusCode(204);
        Reporter.log("SSH Key deleted with ID: " + sshKeyId, true);
    }
}

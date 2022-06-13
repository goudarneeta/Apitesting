package com.tests.simpleCRUDWithTekarchApi;
import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class GetUserDataTest {
    @BeforeClass
	public static void init() {
		RestAssured.baseURI=("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/getdata");
    }
    public static String loginToTekarchApi() {
    	Response response=RestAssured
    			.given()
    			.contentType("application/json")
    			.body("{\"username\":\"neetagireppagoudar@ta.com\",\"password\":\"neetagireppagoudar@123\"}")
    			.post("/login");
    	String token= response.body().jsonPath().getString("[0].token");
    	return token;
    			
	}
@Test(priority = 2, enabled = true)
public static void getUserData() throws IOException  {
	Header header = new Header("token", loginToTekarchApi());
	Response response = RestAssured.given().header(header)
			.when()
			.get("/getdata");
	         response.then().statusCode(200);
	         response.body().prettyPrint();
	         System.out.println("number of records  = "+response.jsonPath().get("$.size()"));
	         String userId = response.jsonPath().getString("[0].userid");
	         String id = response.jsonPath().getString("[0].id");
	         System.out.println("first entry  userdata userid and id is ="+userId+" and "+id);
	         
}
    
}


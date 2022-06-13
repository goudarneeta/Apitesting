package com.tests.simpleCRUDWithTekarchApi;
import java.io.IOException;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import io.restassured.response.Response;

    public class LoginToApi {
	@BeforeClass
	public static void main(String[] args) {
		
	}
			public static void init() {
				RestAssured.baseURI=("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login");
		    }
		    public static void loginToTekarchApi() throws IOException  {
		    	
		    	Response response=RestAssured
		    			.given()
		    			.contentType("application/json")
		    			.body("{\"username\":\"neetagireppagoudar@ta.com\",\"password\":\"neetagireppagoudar@123\"}")
		    			.post("/login");
		    	
		    	response.then().log().all();
		    	response.then().statusCode(HttpStatus.SC_CREATED);
		    	
		    	response.body().prettyPrint();
		    	String token=response.body().jsonPath().getString("[0].token");
		    	String userId=response.body().jsonPath().getString("[0].userId");
		    	System.out.println("TOKEN="+token);
		    	System.out.println("USERID="+userId);
		
	}

}

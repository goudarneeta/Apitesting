package com.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TekarchCrud {
        @Test
        public static void LoginToApp() {
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body("{\"username\":\"neetagireppagoudar@ta.com\",\"password\":\"neetagireppagoudar@123\"}")
		.when()
		.post("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login")
		.then()
		.assertThat().statusCode(201);
		
}
}

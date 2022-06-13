package myCRUD;

public class Post {
	public void postRequestBooksAPI() 
	{ 
	   RestAssured.baseURI = "https://demoqa.com"; 
	   RequestSpecification request = RestAssured.given();
	   // JSONObject is a class that represents a Simple JSON. 
	   // We can add Key - Value pairs using the put method 
	   JSONObject requestParams = new JSONObject(); 
	   requestParams.put("userId", "TQ123"); 
	   requestParams.put("isbn", "9781449325862"); 
	   // Add a header stating the Request body is a JSON 
	   request.header("Content-Type", "application/json"); // Add the Json to the body of the request 
	   request.body(requestParams.toJSONString()); // Post the request and check the response
	   Response response = request.post("/BookStore/V1/Books"); 
	   System.out.println("The status received: " + response.statusLine());
	}
}

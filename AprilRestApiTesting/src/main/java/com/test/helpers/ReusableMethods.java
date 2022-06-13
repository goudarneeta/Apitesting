    package com.test.helpers;
	import java.util.HashMap;

	import java.util.concurrent.TimeUnit;

	import io.restassured.response.Response;

	public class ReusableMethods {

		public static AddUserPojo user;
		public static AddUserPojo GetUserDataToAdd("")  {
			user=new AddUserPOJO("");
			user.setAccountno("");
			user.setDepartmentno("");
			user.setSalary("");
			user.setPincode("");
			return user;
		  }
	      public int getStatusCode(Response response) {
	    	  return response.getStatusCode();
	      }
	      public String getContentType(Response response) {
	    	  return response.getContentType();
	      }
	      public long getResponseTimeIn(Response response, TimeUnit unit) {
	    	  return response.getTimeIn(unit);
	      }
	      public static void verifyStatusCodeis(Response response, int statuscode) {
	    	  response.then().statusCode(statuscode);
	      }
		public static String getJsonPathData(Response res, String string) {
			// TODO Auto-generated method stub
			return null;
		}
	}
}

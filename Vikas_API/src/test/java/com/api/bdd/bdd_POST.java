package com.api.bdd;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.api.dataprovider.jsonbody_input;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class bdd_POST {
	
	public static HashMap map = new HashMap();
	
	  @Test(dataProvider ="put", dataProviderClass = jsonbody_input.class)
	  
	  public void b(String endpoint,String req, String id, String email, String name) {
		  
		  map.put("id",id );
		  map.put("email",email);
		  map.put("first_name",name);
		  
		  RestAssured.basePath = endpoint;
		  RestAssured.basePath = req;
		  
		  
		  given()
		  	.contentType("application/Json")	
		  	.body(map)
		  .when()
		  	.post()
		  .then()
		  	.statusCode(201);  
	 }
}

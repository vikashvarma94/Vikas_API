package com.api.bdd;

import org.testng.annotations.Test;

import com.api.dataprovider.data;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class bdd_GET {


	@Test(dataProvider = "input", dataProviderClass = data.class)
	  public void b(String endpoint,String req) throws InterruptedException {
		  
		  given()
		  	.when().get(endpoint+""+req)
		  	.then().statusCode(200);
	}
	
	@Test(dataProvider = "output", dataProviderClass =data.class)
	  public void f(String code, String Line) {	
		
		given(). when().then()
		.statusCode(200)
		.statusLine(Line)
		.log().all();
}}
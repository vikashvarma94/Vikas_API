package com.api.testcases;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.api.base.baseclass;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc1_get extends baseclass{
	
	
	
	@Test//(dataProvider = "api")
	  public void b() throws InterruptedException {
		  
		  RestAssured.baseURI = "https://reqres.in/api/users";
		  httpreq = RestAssured.given();
		  resp = httpreq.request(Method.GET);
		  Thread.sleep(1000);
	  }
@Test
  public void f() {
	  System.out.println(resp.getStatusLine());
	  System.out.println(resp.getStatusCode());
	  
	  assert.assertEquals(resp.getStatusLine(),"");
	  assert.assertEquals(resp.getStatusCode(),"200");
  }
}

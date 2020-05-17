package com.api.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.baseclass;
import com.api.dataprovider.data;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc1_get extends baseclass{	
	
	
	@Test(dataProvider = "input", dataProviderClass = data.class)
	  public void b(String endpoint,String req) throws InterruptedException {
		  
		  RestAssured.baseURI = endpoint;
		  httpreq = RestAssured.given();
		  resp = httpreq.request(Method.GET,req);
		  Thread.sleep(1000);
	  }
@Test(dataProvider = "output", dataProviderClass = data.class)
  public void f(String code, String Line) {
	  System.out.println(resp.getStatusLine());
	  System.out.println(resp.getStatusCode());
	  
	  Assert.assertEquals(resp.getStatusLine(),Line);
	  Assert.assertEquals(resp.getStatusCode(),code);
  }
}

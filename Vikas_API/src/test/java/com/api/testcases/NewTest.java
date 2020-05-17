package com.api.testcases;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.api.base.baseclass;

import com.api.dataprovider.jsonbody_input;

import io.restassured.RestAssured;
import io.restassured.http.Method;


public class NewTest extends baseclass {
	
  @Test//(dataProvider ="put", dataProviderClass = jsonbody_input.class)
  
  public void b() {
	  RestAssured.baseURI = "https://reqres.in/api";
	  httpreq = RestAssured.given();
	  
	  JSONObject jsonparm = new JSONObject();
	  jsonparm.put("id","9" );
	  jsonparm.put("email","test@gmail.com");
	  jsonparm.put("first_name","vikas");
	  
	  httpreq.header("Context-Type","application/json");
	  httpreq.body(jsonparm.toString());
	  
	  resp = httpreq.request(Method.POST,"/users");
//  }
//
//@Test
//public void g() {
	System.out.println(resp.getStatusCode());
  }
	
}
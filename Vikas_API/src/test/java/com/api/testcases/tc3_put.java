package com.api.testcases;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.api.base.baseclass;

import com.api.dataprovider.jsonbody_input;

import io.restassured.RestAssured;
import io.restassured.http.Method;


public class tc3_put extends baseclass {
	
  @Test(dataProvider ="put", dataProviderClass = jsonbody_input.class)
  
  public void b(String endpoint,String req, String id, String email, String name) {
	  RestAssured.baseURI = endpoint;
	  httpreq = RestAssured.given();
	  
	  JSONObject jsonparm = new JSONObject();
	  jsonparm.put("id",id );
	  jsonparm.put("email",email);
	  jsonparm.put("first_name",name);
	  
	  httpreq.header("Context-Type","application/json");
	  httpreq.body(jsonparm.toString());
	  
	  resp = httpreq.request(Method.PUT,req);
 }

@Test
public void g() {
	System.out.println(resp.getStatusCode());
  }
	
}
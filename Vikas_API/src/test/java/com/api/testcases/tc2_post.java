package com.api.testcases;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.api.base.baseclass;

import com.api.dataprovider.jsonbody_input;

import io.restassured.RestAssured;
import io.restassured.http.Method;


public class tc2_post extends baseclass {
  @Test(dataProvider = "jsonbody",dataProviderClass = jsonbody_input.class)
  
  public void f(String endpoint,String req, String id, String email, String name) {
	  RestAssured.baseURI = endpoint;
	  httpreq = RestAssured.given();
	  
	  JSONObject jsonparm = new JSONObject();
	  jsonparm.put("id",id );
	  jsonparm.put("email",email);
	  jsonparm.put("name",name);
	  
	  httpreq.header("Context_type","application/JSON");
	  httpreq.body(jsonparm.toString());
	  
	  resp = httpreq.request(Method.POST,req);
  }

@Test
public void g() {
	System.out.println(resp.getStatusCode());
}
	
}
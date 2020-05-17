package com.api.base;

	

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
		
	public class baseclass {
		
		public static RequestSpecification httpreq;
		public static Response resp;
		public String id="1";	
		public Logger logger;
		
		@BeforeClass
		public void setUp() {
			logger=Logger.getLogger("EmployeesRestAPI");
			PropertyConfigurator.configure("log4j.properties");
			logger.setLevel(Level.DEBUG);
					}}


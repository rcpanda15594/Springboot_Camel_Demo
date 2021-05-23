package com.example.camel.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
	//	from("file:C:/Users/HCL/Desktop/a").to("file:C:/Users/HCL/Desktop/b");
		
		//from("http://localhost:9090/getAllEmployee").process(){
	}

	
}

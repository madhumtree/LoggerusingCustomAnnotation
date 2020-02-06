package com.restassured.example.restassureddemo;

import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EUCController {

	@Autowired
	ServiceImpl obj;
	
	@RequestMapping(value="/echo")
	public String echo() {
		obj.echo("");
		 MDC.put("testId", "40");
		return "echo";
	}
	
}

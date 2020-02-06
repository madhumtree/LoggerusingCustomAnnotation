package com.restassured.example.restassureddemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ServiceImpl {

	Logger log=LoggerFactory.getLogger(ServiceImpl.class);
	
	@EucLogger
	public void echo(String m) {
		log.info("sample log");
		log.debug("sample log");
	}
	
}

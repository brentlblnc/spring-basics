package com.brent.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalService {
	// get from external.service.url
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceURL() {
		return this.url;
	}
}

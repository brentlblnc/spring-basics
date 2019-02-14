package com.brent.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.brent.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.brent.spring.basics.springin5steps.properties.SomeExternalService;

@SpringBootApplication
// app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans?
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsPropertiesApplication.class);
	
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsPropertiesApplication.class, args);
		SomeExternalService someExtService 
			= applicationContext.getBean(SomeExternalService.class);
		
		LOGGER.info("{}", someExtService.returnServiceURL());
		
//		Bean scope default - singleton
//		- Singleton: one instance per spring context
//		- Prototype - new bean whenever requested
//		- Request - one bean per HTTP request
//		- Session - one bean per HTTP session
		
		// Other options available instead of declaring beans via @Component
		// @Component - generic component
		// @Repository - encapsulating retrieval, storage and queries to relational DB
		// @Service - defines a business service (model)
		// @Controller - defines controller in MVC
	}

}


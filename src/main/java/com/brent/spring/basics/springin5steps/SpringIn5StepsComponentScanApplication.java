package com.brent.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.brent.spring.basics.componentScan.ComponentDAO;
import com.brent.spring.basics.springin5steps.scope.PersonDAO;


@SpringBootApplication
@ComponentScan("com.brent.spring.basics.componentScan")
public class SpringIn5StepsComponentScanApplication {

	// @SpringBootApplication annotation automatically defines component scan on package and sub-packages
	// @ComponentScan defines a package to scan if it's not a sub-package of package where @SpringBootApplication resides
	
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		ComponentDAO componentDAO = 
		applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		
//		Bean scope default - singleton
//		- Singleton: one instance per spring context
//		- Prototype - new bean whenever requested
//		- Request - one bean per HTTP request
//		- Session - one bean per HTTP session
	}

}


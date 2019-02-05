package com.brent.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.brent.spring.basics.springin5steps.scope.PersonDAO;


@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans?
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO personDAO = 
		applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO2 = 
				applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
		
//		Bean scope default - singleton
//		- Singleton: one instance per spring context
//		- Prototype - new bean whenever requested
//		- Request - one bean per HTTP request
//		- Session - one bean per HTTP session
	}

}


package com.brent.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.brent.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans?
	
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearch 
			= applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch1
		= applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result 
			= binarySearch.binarySearch(new int[] {12, 4,  6}, 3);
		System.out.println(result);
		
//		Bean scope default - singleton
//		- Singleton: one instance per spring context
//		- Prototype - new bean whenever requested
//		- Request - one bean per HTTP request
//		- Session - one bean per HTTP session
	}

}


package com.brent.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	/* Sort an array
	 * Search the array
	 * Return the result
	 */
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	// sortAlgorithm is a dependency of BinarySearchImpl
	// Autowiring can occur by name of instance variable
	// @Primary annotation has higher priority than naming
	



	public int binarySearch(int[] numbers, int numSearch) {
		// Sorting and searching logic
		// Quick sort algorithm
		// Bubble sort algorithm
		
		int[] sortedNums = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search the array
		
		return 3;
	}
	
	// As soon as SortAlgorithm bean is created, @PostConstruct is called
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
}

package org.kalyan.learnspring.consuctort.inject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	//Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SortAlgorithm sortAlgorithm;

	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
		System.out.println("In Constructor");
	}


	public int binarySearch(int[] numbers, int numberToSearch) {
		
			int[] sorterNumbers = sortAlgorithm.sort(numbers);
			System.out.println(sortAlgorithm);
			return 4;
		
	}
	
}

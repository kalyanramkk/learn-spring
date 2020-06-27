package org.kalyan.learnspring.basic;

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
	
	
	@Autowired
	private SortAlgorithm sortAlgorithm;

	
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		
			int[] sorterNumbers = sortAlgorithm.sort(numbers);
			System.out.println(sortAlgorithm);
			return 4;
		
	}
	
	
}

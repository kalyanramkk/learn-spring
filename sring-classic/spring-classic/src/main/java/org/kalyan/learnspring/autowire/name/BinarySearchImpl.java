package org.kalyan.learnspring.autowire.name;

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
	private SortAlgorithm quickSortAlgorithm;

		
	public int binarySearch(int[] numbers, int numberToSearch) {
		
			int[] sorterNumbers = quickSortAlgorithm.sort(numbers);
			System.out.println(quickSortAlgorithm);
			return 4;
		
	}
	
	//Here Autowiring is happening based on name of the SortAlgorithm
	//@Primary has higher priority then autowiring using name.
}

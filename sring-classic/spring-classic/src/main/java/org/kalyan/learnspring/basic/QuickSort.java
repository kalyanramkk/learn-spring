package org.kalyan.learnspring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		return numbers;
	}


}

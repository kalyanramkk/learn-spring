package org.kalyan.learnspring.autowire.name;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BubbleSortAlgorithm  implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		return numbers;
	}

}

package org.kalyan.learnspring.setter.inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BubbleSort  implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		return numbers;
	}

}

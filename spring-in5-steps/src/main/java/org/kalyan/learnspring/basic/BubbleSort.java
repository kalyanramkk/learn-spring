package org.kalyan.learnspring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BubbleSort  implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		System.out.println("INNNNN BubbleSort");
		return numbers;
	}

}

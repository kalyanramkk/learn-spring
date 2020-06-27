package com.kalyan.mockito.mockitodemo;

import java.util.ArrayList;

public class SomeComplexBusinessData {
	
	private String someString;

	public SomeComplexBusinessData(String someString) {
		
		this.someString = someString;
		
	}
	
	public void doSomething() {
		System.out.println(this.someString);
		
	}
}

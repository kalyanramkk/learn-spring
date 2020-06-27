package com.kalyan.mockito.mockitodemo;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	int findGreatest() {
		int[] data = dataService.retrieveAllData();
		
		int greatest = Integer.MIN_VALUE;
		for(int i : data) {
			if(i>greatest) {
				greatest = i;
				
			}
			
		}
		return greatest;
	}

}

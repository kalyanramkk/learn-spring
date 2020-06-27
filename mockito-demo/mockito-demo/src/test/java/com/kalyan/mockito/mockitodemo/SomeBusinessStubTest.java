package com.kalyan.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void testFindGreatest() {
		
		SomeBusinessImpl businessImpl =  new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findGreatest();
		assertEquals(14, result);
		
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {13,3,14};
	}
	
}

//Lot of code to create stub
//For each scenario we need to creae new stub

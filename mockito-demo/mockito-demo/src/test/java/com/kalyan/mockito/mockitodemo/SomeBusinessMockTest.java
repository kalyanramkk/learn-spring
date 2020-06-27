package com.kalyan.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	void testFindGreatest() {
		
		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3,56,4});
		SomeBusinessImpl businessImpl =  new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findGreatest();
		assertEquals(56, result);
		
	}
	
	@Test
	void testFintGreatest_OneValue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3});
		SomeBusinessImpl businessImpl =  new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findGreatest();
		assertEquals(3, result);
		
	}

}





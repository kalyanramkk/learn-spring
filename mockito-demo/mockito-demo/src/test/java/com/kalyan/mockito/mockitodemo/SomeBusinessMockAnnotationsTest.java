package com.kalyan.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockAnnotationsTest {
	
	@Mock
	DataService dataServiceMock;
	@InjectMocks
	SomeBusinessImpl businessImpl;
	

	@Test
	void testFindGreatest() {
		
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3,56,4});
		int result = businessImpl.findGreatest();
		assertEquals(56, result);
		
	}
	
	@Test
	void testFintGreatest_OneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3});
		int result = businessImpl.findGreatest();
		System.out.println(result);
		assertEquals(3, result);
		
	}

}





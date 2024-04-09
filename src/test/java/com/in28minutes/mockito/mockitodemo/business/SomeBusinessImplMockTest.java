package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
	
	@Mock
	private DataService dataServiceMock;
//	mock is created
	
	@InjectMocks
	private SomeBusinessImpl someBusinessImpl;
//	all dependencies are injected

	@Test
	void SomeBusinessImplTestBasic() {
//		Create mock of this class
		
//		DataService dataServiceMock =  mock(DataService.class);
		
//		dataServiceMock.retrieveAll() => new int[] {25, 15, 5, 30}
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {25, 15, 5});
		
//		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		
		int result = someBusinessImpl.findGreatestformAllvalue();
		assertEquals(result, 25);
	}
	
	
//	@Test
//	void SomeBusinessImplTestOneValue() {
////		Create mock of this class
//		DataService dataServiceMock =  mock(DataService.class);
////		dataServiceMock.retrieveAll() => new int[] {25, 15, 5, 30}
//		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {25});
//		
//		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
//		int result = someBusinessImpl.findGreatestformAllvalue();
//		assertEquals(result, 25);
//	}


}


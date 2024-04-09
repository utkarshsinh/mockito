package com.in28minutes.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;


public class ListTest {
	
	@Test
	void simpleTest() {
		
		List<?> listmock = mock(List.class);
		
		when(listmock.size()).thenReturn(3);
		
		assertEquals(3, listmock.size());
		
	}
	
	@Test
	void multipleTest() {
		
		List<?> listmock = mock(List.class);
		
		when(listmock.size()).thenReturn(1).thenReturn(2);
		
		assertEquals(1, listmock.size());
		assertEquals(2, listmock.size());
		
	}
	
	@Test
	void parameters() {
		
		List listmock = mock(List.class);
		
		when(listmock.get(0)).thenReturn("SomeString");
		
		assertEquals("SomeString",listmock.get(0) );
		
		assertEquals("SomeString",listmock.get(1) );
		
	}


}

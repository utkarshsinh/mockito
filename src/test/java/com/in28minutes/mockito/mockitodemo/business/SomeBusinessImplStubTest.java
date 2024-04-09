package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void SomeBusinessImplTestBasic() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataserviceStub1());
		int result = someBusinessImpl.findGreatestformAllvalue();
		assertEquals(result, 30);
	}
	
	@Test
	void SomeBusinessImplTestOneValue() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataserviceStub2());
		int result = someBusinessImpl.findGreatestformAllvalue();
		assertEquals(result, 30);
	}

}

class DataserviceStub1 implements DataService{

	@Override
	public int[] retrieveAll() {
		// TODO Auto-generated method stub
		return new int[] {25, 15, 5, 30};
	}
	
}

class DataserviceStub2 implements DataService{

	@Override
	public int[] retrieveAll() {
		// TODO Auto-generated method stub
		return new int[] {30};
	}
	
}

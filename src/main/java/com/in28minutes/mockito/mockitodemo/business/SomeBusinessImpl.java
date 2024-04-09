package com.in28minutes.mockito.mockitodemo.business;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findGreatestformAllvalue() {
		int[] nums = dataService.retrieveAll();
		
		int greatestValue = 0;
		
		for(int num: nums) {
			if(num>greatestValue) {
				greatestValue = num;
			}
		}
		
		return greatestValue;
	}
}

interface DataService{
	int[] retrieveAll();
}
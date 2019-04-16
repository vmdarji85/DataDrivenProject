package com.w2a.rough;

public class VaribaleType {
	
	public static void main(String[] args) {
		int i = 45;
		Integer wrapper = new Integer(i);
		
		int unwarpper = wrapper.intValue();
		System.out.println(unwarpper);
	}
	
	

}

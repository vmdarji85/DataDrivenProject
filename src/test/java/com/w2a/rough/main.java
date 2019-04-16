package com.w2a.rough;

public class main {
	
	public static void main(String[] args) {
		/*
		 * GenericcClassExample<Integer> iObj = new GenericcClassExample<Integer>(10);
		 * System.out.println(iObj.getObject());
		 * 
		 * GenericcClassExample<String> sObj = new
		 * GenericcClassExample<String>("Vivek"); System.out.println(sObj.getObject());
		 */
		
		GenericcClassExample<String, Integer> obj = new GenericcClassExample<String, Integer>("Vivek", 10);
		obj.print();
		
		Test itest = new Test();
		itest.displayInfo("vivek");
		itest.displayInfo(10);
		itest.displayInfo(10.5);
		
		NewTest<String> nw = new NewTest<String>("Vivek");
		System.out.println(nw.getObject());
	}
}

package com.w2a.rough;

class GenericcClassExample<T,U> {
	T Obj1;
	U Obj2;
	
	 GenericcClassExample(T Obj1, U Obj2) {
		this.Obj1 = Obj1;
		this.Obj2 = Obj2;
	}
	
	public void print () {
		System.out.println(Obj1);
		System.out.println(Obj2);
	}
	
	
}


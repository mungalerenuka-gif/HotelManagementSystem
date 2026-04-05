package com.practice.oops.abstraction;

public class child extends Abstract {

	void add() {
		System.out.println("this is abstracted method with no parameter");
	}
	
	
	int add(int a, int b) {
		System.out.println("this is abstract add methiod with parameter");
		return 0;
	}
	
	public static void main(String[] args) {
		 child c=new child();
		 
		 int s=c.add(1, 2);
		 System.out.println(s);
	}
	
}

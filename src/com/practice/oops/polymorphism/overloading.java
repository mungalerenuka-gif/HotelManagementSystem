package com.practice.oops.polymorphism;

public class overloading {

	
	 private void m1(int a,int b) {
		 int c=a+b;
		 System.out.println("1.i am m1 method with 2 parameter");
	}
	 static{
	 System.out.println("static block");
	 }
	 private void m1(int a,int b,int c){
		 int d=a+b+c;
		 System.out.println("2.i am m1 method with 3 parameter");
		 this.m1(90,100);
	}
	 {
		 System.out.println("i m a instance block");
		 this.m1(34,56,56);
	 }
	 static{
	 System.out.println("static 2");
	 }
	 
	 public static void main(String[] args) {
		overloading over=new overloading();
		over.m1(2,3,1);
		
	}
}

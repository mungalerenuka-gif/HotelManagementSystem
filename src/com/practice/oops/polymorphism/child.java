package com.practice.oops.polymorphism;

public class child extends parent {
	public child() {
	super.m1();
	}
	@Override
	public void m1() {
		System.out.println("i am 1st overriden method in child");
		super.m1();
	}
	@Override
	public void m2() {
		System.out.println("i am 2nd overridden in child");
		super.m2();
	}
	{
		System.out.println("i am instance block of child");
	}
	static {
		System.out.println("i am staitc block of child");
	}
	int a=10;
	int [] arr= {13,13,13,};
	String s="hello child";
	public static void main(String[] args) {
		parent p=new parent();
		parent p1=new child();
		child ch=new child();
		ch.m1();
		ch.m2();
		System.out.println(p1.a);
		System.out.println(p1.s);
		System.out.println(p.arr[2]);
		System.out.println(ch.s);
	}

}
//how this output is coming

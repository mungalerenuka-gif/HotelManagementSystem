package com.practice.collectionframework;
import java.util.ArrayList;
public class arrayListDemo {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();

		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		
		boolean s=al.add(1);
		
		al.get(2);
	
		System.out.println(s);
		System.out.println(al.get(4));
		
	}

	
}

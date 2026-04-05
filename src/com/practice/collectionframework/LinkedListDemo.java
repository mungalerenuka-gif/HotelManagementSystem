package com.practice.collectionframework;

import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		
	LinkedList ll=new LinkedList();
	
	
	ll.add(0, 12);
	ll.add(1,13);
	ll.add(1, 15);
	ll.add(1, 11);
	
	System.out.println(ll);
	
	System.out.println(ll.get(0));
	}

}


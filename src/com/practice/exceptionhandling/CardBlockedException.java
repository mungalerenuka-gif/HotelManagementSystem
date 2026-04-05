package com.practice.exceptionhandling;

public class CardBlockedException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return"Your Card Has Been Blocked , Contact Your Nearest Branch !!";
	}
}

package org.base;

public class DateNotBoundException extends Exception {
	
	@Override
	public String getMessage() {
		
		String s1 = "The date is not real DOB";
		return s1;
		System.out.println("perf");
	}
}

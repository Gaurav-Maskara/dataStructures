package com.gaurav.codility;

public class MultiProcessCheck {

	public static void main(String[] args) {

		long miliStart=System.currentTimeMillis();
		
		long counter=runner();
		
		long miliStop=System.currentTimeMillis();
		
		long timeTaken=miliStop-miliStart;
		
		System.out.println("Time start " +miliStart);
		System.out.println("Time stop "+miliStop);
		System.out.println("Time taken "+timeTaken);
		System.out.println("Counter "+counter);
		
		ProcessBuilder processBuilder = new ProcessBuilder();
	}
	
	
	
	public static long runner() {
		
		long counter=0;
		for(long i=0; i<Long.MAX_VALUE/1000000000L; i++) {
			counter++;
		}
		return counter;
	}

}

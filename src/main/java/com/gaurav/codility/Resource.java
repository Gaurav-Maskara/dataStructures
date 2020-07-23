package com.gaurav.codility;

public class Resource {
	
	
	public synchronized void print(String threadName) {
		for(int i=1; i<=5; i++) {
			System.out.println(i +" "+threadName);
		}
	}

}

package com.gaurav.main;

public class test {

	public static void main(String[] args) {
		int i=0;
		try {
			i=sum();
		}catch(Exception e) {
			System.out.println(i);
		}
	}
	
	
	public static int sum() throws Exception {
		try {
			throw new Exception();
		}catch(Exception e) {
			return 6;
		}finally {
			throw new Exception();
		}
	}
	

}

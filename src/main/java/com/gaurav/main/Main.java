package com.gaurav.main;

import java.io.Serializable;

public class Main implements Serializable {

	public static void main(String[] args) {

		
		print(1);
		print(new Integer(1));
		print(null);
		
	}
	
	
	public static void print(int a) {
		System.out.println("integer");
	}
	
	public static void print(Integer a) {
		System.out.println("Integer");
	}
	
	public static void print(Object a) {
		System.out.println("Object");
	}
	
	
	

}






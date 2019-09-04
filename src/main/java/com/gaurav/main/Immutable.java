package com.gaurav.main;

public class Immutable {
	
	private static Immutable im;
	private static Object obj=new Object();
	
	private String a;
	
	private Immutable() {
		
	}
	
	
	
	public static Immutable getInstance() {
		if(im==null) {
			   synchronized(obj) {
				   if(im==null) {
					  im=new Immutable(); 
				   }
			   }
		}
		return im;
	}
	
	

}

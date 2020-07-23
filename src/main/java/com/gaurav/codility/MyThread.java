package com.gaurav.codility;

public class MyThread implements Runnable {
 
	Resource resource;
	String threadName;
	
	public MyThread(Resource resource, String threadName) {
		this.resource=resource;
		this.threadName=threadName;
	}
	
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true)
		resource.print(threadName);
	}

}

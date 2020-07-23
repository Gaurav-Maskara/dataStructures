package com.gaurav.codility;

public class EvenOdd {

	public static void main(String[] args) {

		Numbers no=new Numbers();
		
		OddThread ot=new OddThread(no);
		EvenThread et=new EvenThread(no);
		
		Thread t1=new Thread(ot);
		Thread t2=new Thread(et);
		
		t1.start();
		t2.start();
		
	}

}



class Numbers{
	
	boolean flag=false;
	
	public synchronized void printOdd() throws InterruptedException {
		for(int i=1; i<=99; i=i+2) {
			 System.out.println(i);
			 wait();
			 notify();
		}
	}
	
	
	public synchronized void printEven() throws InterruptedException {
		for(int i=2; i<=100; i=i+2) {
			System.out.println(i);
			notify();
			wait();
		}
	}
	
}

class OddThread implements Runnable{

	    private Numbers no;
		public OddThread(Numbers no) {
		   this.no=no;
		}
	
		public void run() {
			try {
				no.printOdd();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}


class EvenThread implements Runnable{

    private Numbers no;
	public EvenThread(Numbers no) {
	   this.no=no;
	}

	public void run() {
		try {
			no.printEven();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


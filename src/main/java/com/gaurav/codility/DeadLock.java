package com.gaurav.codility;

public class DeadLock {

	public static void main(String[] args) {
		SharedResource1 sharedResource1=new SharedResource1();
		SharedResource2 sharedResource2=new SharedResource2();
		new Thread(new DeadlockThread(sharedResource1, sharedResource2)).start();
		new Thread(new DeadlockThread2(sharedResource1, sharedResource2)).start();
	}
}

class SharedResource1{
}

class SharedResource2{
}

class DeadlockThread implements Runnable{
	SharedResource1 sharedResource1;
	SharedResource2 sharedResource2;
	
	public DeadlockThread(SharedResource1 sharedResource1, SharedResource2 sharedResource2) {
      this.sharedResource1=sharedResource1;
      this.sharedResource2=sharedResource2;
	}
	
	public void run() {
		
		synchronized (sharedResource1) {
			System.out.println("Acquired lock on sharedresource 1");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
			}
			
			synchronized (sharedResource2) {
				System.out.println("Acquired lock on sharedresource 2");
			}
		}
	}
}


class DeadlockThread2 implements Runnable{
	SharedResource1 sharedResource1;
	SharedResource2 sharedResource2;
	
	public DeadlockThread2(SharedResource1 sharedResource1, SharedResource2 sharedResource2) {
      this.sharedResource1=sharedResource1;
      this.sharedResource2=sharedResource2;
	}
	
	public void run() {
		
		synchronized (sharedResource2) {
			System.out.println("Acquired lock on sharedresource 2");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
			}
			
			synchronized (sharedResource1) {
				System.out.println("Acquired lock on sharedresource 1");
			}
		}
	}
}

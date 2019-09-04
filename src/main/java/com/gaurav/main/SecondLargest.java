package com.gaurav.main;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		int largest=arr[0];
		int secondLargest=arr[0];
		int thirdLargest=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(largest<arr[i]) {
				thirdLargest=secondLargest;
				secondLargest=largest;
				largest=arr[i];
			}
		}
		 System.out.println(thirdLargest);
	}
}

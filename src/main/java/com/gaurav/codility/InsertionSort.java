package com.gaurav.codility;

public class InsertionSort {
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
	public int[] insertionSort(int[] arr) {
		
		
		for(int i=0; i<arr.length; i++) {
			  
			  for(int j=i+1; j<arr.length; j++) {
				    if(arr[i]>arr[j]) {
				    	int temp=arr[i];
				    	arr[i]=arr[j];
				    	arr[j]=temp;
				    }
				  
				  
			  }
		}
		
		
		
		
		
		return arr;
	}

}

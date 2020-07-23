package com.gaurav.geeksForGeeks;

public class GeeksForGeeks_ArrayRotation {

	public static void main(String[] args) {
		
		int[] arr= {1, 2, 3, 4, 5, 6, 7};
		rotate(arr, 2);
	}
	
	
	
	public static void rotate(int[] arr, int rotationKey) {
		
          int[] temp=new int[rotationKey];
          
          for(int i=0; i<rotationKey; i++) {
        	  temp[i]=arr[i];
          }
          
          int t=0;
          for(int i=rotationKey; i<arr.length; i++) {
        	  arr[t]=arr[i];
        	  t++;
          }
          
          t=0;
          for(int i=arr.length-rotationKey; i<arr.length; i++) {
        	  arr[i]=temp[t];
        	  t++;
          }
		
		  for(int i=0; i<arr.length; i++) {
			  System.out.print(arr[i]);
		  }
		
	}

}

package com.gaurav.codility;

public class PermCombination {

	
	public static void main(String args[]) {
		
	}
	
	
	
	public static int solution(int[] A) {

	     if(A!=null && A.length>0) {
	    	int length=A.length;
	 		long sumToBe=(length*(length+1))/2;
	 		long sumActual=0;
	 		int count=0;
	 		
	 		for(int i=0; i<length; i++) {
	 			if(A[i]!=0) {
	 				sumActual=sumActual+A[i];
	 				count++;
	 			}
	 		}
	 		int valueToReturn=0;
	 		 if(count==length) {
	 			 valueToReturn=(sumActual-sumToBe==0)?1:0; 
	 		 }
	 		return valueToReturn;
	     }
	     return 0;
	}
	
}

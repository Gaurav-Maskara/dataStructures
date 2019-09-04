package com.gaurav.main;

public class FloodDepth {

	public static void main(String[] args) {
        int[] A= {1,3,2,1,2,1,5,3,3,4,2};
		
        
        System.out.println(solution(A));
	}
	
	
	public static int solution(int[] A) {
		int depth=0;
		
		for(int i=1; i<A.length-2; i++) {
		    
		   int left=0;
		   int right=0;
		   
			   for(int j=i-1; j>=0; j--) {
				   if(A[j]>A[i] && left<A[j]) {
					   left=A[j];
				   }
			   }
		   
			   for(int j=i+1; j<A.length; j++) {
				   if(A[j]>A[i] && right<A[j]) {
					   right=A[j];
				   }
			   }
			  
				     int tempDepth=0;
				     if(left>right) {
				    	  tempDepth=right-A[i];
				     }else {
				    	 tempDepth=left-A[i];
				     }
				
				     if(depth<tempDepth) {
				    	 depth=tempDepth;
				     }
		}
		return depth;
	}
	
	


}

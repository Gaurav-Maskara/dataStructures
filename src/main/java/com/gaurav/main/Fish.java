package com.gaurav.main;

public class Fish {

	public static void main(String[] args) {

	}
	
	
	
	public static int solution(int[] A, int[] B) {
       
		int totalFishes=A.length;
		
		
		for(int i=0; i<A.length-1; i++) {
			int fishSize=A[i];
			int fishDirection=B[i];
			
			if(fishDirection==0) {
				continue;
			}
			
			for(int j=i+1; j<A.length; j++) {
				
				if(B[j]==0) {
					if (fishSize > A[j] || A[j]> fishSize) {
						totalFishes--;
					}
				}
				
			}
		}
		 return totalFishes;
    }

}

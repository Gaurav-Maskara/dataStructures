package com.gaurav.codility;

public class CyclicRotation {

	
	public static void main(String args[]) {
		int[] A = {4,6,0,0,-2,10};
			  int  K = 1;
		
		int[] solution=solution(A, K);
		
		for(int i=0; i<solution.length; i++) {
			System.out.print(solution[i] +" ");
		}
	}
	
	public static int[] solution(int[] A, int K) {
  
		 int[] rotationArray=new int[A.length];
		 int length=A.length;
		 
		for(int j=1 ;j<=K; j++) {
			
			 rotationArray[0]=A[length-1];
			 int counter=1;
			 for(int i=0; i<length-1; i++) { 
				 rotationArray[counter]=A[i];
				 counter++;
			 }
			 A=rotationArray;
			 if(j<K) {
				 rotationArray=new int[length];
			 }
		}
		return rotationArray;
	}
	
	
}

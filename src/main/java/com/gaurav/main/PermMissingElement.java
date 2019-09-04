package com.gaurav.main;

public class PermMissingElement {

	public static void main(String[] args) {
		int[] A= {2,3,1,5};
		
		System.out.println(PermMissingElement.solution(A));

	}

	public static int solution(int[] A) {

		int length=A.length;
		int n=length+1;
		
		int sumOfAllElements=(n*(n+1))/2;
		
		int sumGiven=0;
		for(int i=0; i<length; i++) {
			sumGiven=sumGiven+A[i];
		}
		
		return sumOfAllElements-sumGiven;
	
	}

}

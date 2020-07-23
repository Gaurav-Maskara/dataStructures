package com.gaurav.codility;

import java.util.ArrayList;

public class FindAllPermutationsOfString {

	
	public static ArrayList<String> findAllPermutation(String word){
		char[] chrs=word.toCharArray();
		int permutations=factorial(chrs.length);
		
		
		int count=permutations;
		for(int i=0; i<permutations; i++) {
			
			char fixedCharacter=chrs[i];
			
			
			
			
		}
		
		
		
		
		return null;
	}
	
	
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	
	
	public static void main(String[] args) {
		
        System.out.println(factorial(3));
	}

}

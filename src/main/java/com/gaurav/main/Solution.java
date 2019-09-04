package com.gaurav.main;

import java.util.HashMap;
import java.util.Iterator;

public class Solution {
	
	
	public static void main(String args[]) {
		int[] A= new int[999999];
		
		for(int i=0; i<A.length-1; i++) {
			if((i+1)%2==0) {
				A[i]=19;
			}
			else {
				A[i]=17;
			}
		}
		
		A[A.length-1]=22;
		
		System.out.println(Solution.solution(A));
	}
	
	public static int solution(int[] A) {

		int valueToReturn=0;
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for(int i=0; i<A.length; i++) {
			
			if(hm.get(A[i])!=null) {
				int counter=hm.get(A[i]);
				counter++;
				hm.put(A[i], counter);
			}
			else {
				hm.put(A[i], 1);
			}
		}
	      Iterator<Integer> itr	=hm.keySet().iterator();
		
		 while(itr.hasNext()) {
			
			 int key=itr.next();
			 int value=hm.get(key);
			 if(value==1) {
				 valueToReturn=key;
				 break;
			 }
				 
		 }
	   return valueToReturn;
	}

}

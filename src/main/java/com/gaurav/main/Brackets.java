package com.gaurav.main;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		{{}}
	}
	
	
	
	public static int solution(String S) {
		int result=1;
		
		if(S!=null) {
			char[] chrs=S.toCharArray();
			Stack<Character> myStack=new Stack<Character>();
	         for(int i=0; i<chrs.length; i++) {
	        	 
	        	 if(chrs[i]=='(' ||chrs[i]=='{' ||chrs[i]=='[' ) {
	        		 myStack.push(chrs[i]);
	        	 }
	        	 else {
	        		 char temp=(char) myStack.pop();
	        		 
	        		 if((temp=='(' && chrs[i]==')') || (temp=='{' && chrs[i]=='}') || (temp=='[' && chrs[i]==']')) {
	        			 //result=1;
	        		 }
	        		 else {
	        			 result=0;
	        		 }
	        	 }
	         }
	         
	         return result;
		}
	     return 0;
	}
	

}

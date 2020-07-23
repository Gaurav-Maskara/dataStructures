package com.gaurav.codility;

public class LongestPassword {

	public static void main(String[] args) {

		String S=S = "tt3 tt3 tt3 tt3";
		
		
		System.out.println(solution(S));
		
		
	}
	
	
	
	 public static int solution(String S) {
		String[] words=S.split(" ");
		    
		int count=-1;
		
		for(int i=0; i<words.length; i++) {
			boolean ifValidPassword=passwordRuleBook(words[i]);
			if(ifValidPassword) {
				int length=words[i].length();
				if(count < length) {
					count=length;
				}
			}
		}
		 return count;
	 }
	 
	 
	 public static boolean passwordRuleBook(String a) {
		 char[] chrs=a.toCharArray();
		 int alphabets=0;
		 int numerals=0;
		 
		 for(int i=0; i<chrs.length; i++) {
			 char temp=chrs[i];
			 int ascii=(int)temp;
			 
			 if((ascii>=97 &&ascii<=122) || (ascii>=65 && ascii<=90)) {
				 alphabets++;
			 }else if (ascii>=48 && ascii<=57){
				 numerals++;
			 }
			 else {
				 return false;
			 }
		 }
		 if(alphabets%2==0 && numerals%2==1) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

}

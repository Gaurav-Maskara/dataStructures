package com.gaurav.main;

class BinaryGap {
	
	public static void main(String args[]) {
		
		System.out.println(BinaryGap.solution(17));
	}
	
	
    public static int solution(int N) {
    	
    	Integer no = new Integer(N);
    	String binary=no.toBinaryString(no);
    	
    	char[] binaryCharArray=binary.toCharArray();
    	
    	int longestBinaryGap=0;
    	int localCounter=0;
    	
    	for(int i=0; i<binaryCharArray.length; i++) {
    		if(binaryCharArray[i]=='0') {
    			localCounter++;
    		}
    		else {
    			
    			if(longestBinaryGap<localCounter) {
    				longestBinaryGap=localCounter;
    			}
    			localCounter=0;
    		}
    	}
    	return longestBinaryGap;
    }
    
    
}
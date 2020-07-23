package com.gaurav.geeksForGeeks;

public class GeeksForGeeks_Stack {
      
     int[] stack=new int[1000];
     int top=-1;
     
     
     public void push(int data) {
    	 if(top>=999) {
    		 System.out.println("Stack is full");
    		 return;
    	 }
    	 else {
    		 stack[++top]=data;
    	 }
     }
     
     
     public void pop() {
    	 if(top<0) {
    		 System.out.println("Stack is emplty");
    		 return;
    	 }else {
    		 System.out.println(stack[top]);
    		 top--;
    		 return;
    	 }
     }
	
	
	public static void main(String[] args) {
		

	}

}

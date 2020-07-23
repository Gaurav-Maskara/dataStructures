package com.gaurav.codility;

import java.util.ArrayList;
import java.util.Stack;

public class FindTheCommonAncestor {
	Node root;
	
	static class Node{
		String data;
		Node left;
		Node right;
		
		Node(String data){
			this.data=data;
		}
	}
	
	public Stack<Node> dfs(String keyToFind) {
		Node temp=root;
		Stack<Node> mystack=new Stack<Node>();
		
		mystack.push(temp);
		
		while(temp!=null) {
			
			if(temp.data.equalsIgnoreCase(keyToFind)) {
				return mystack;
			}
			else {
				
				if(temp.left!=null) {
					temp=temp.left;
					mystack.push(temp);
				}else {
					
					mystack.pop();
					Node temp2=mystack.pop();
					mystack.push(temp2);
					
					if(temp2.right!=null) {
						temp2=temp2.right;
						temp=temp2;
						//mystack.push(temps)
					}
					else {
						
					}
				}
				
				
				
				
			}
			
			
		}
		return mystack;
		
	}	
	
	
	public void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        printInorder(node.left); 
  
        System.out.print(node.data + " "); 
  
        printInorder(node.right); 
    } 
	
	
	

	public static void main(String[] args) {
		FindTheCommonAncestor obj=new FindTheCommonAncestor();
		
		obj.root=new Node("A");
		
		obj.root.left=new Node("B");
		obj.root.left.left=new Node("D");
		obj.root.left.right=new Node("E");
		
		obj.root.left.left.left=new Node("H");
		obj.root.left.left.right=new Node("I");
		
		obj.root.right=new Node("C");
		obj.root.right.left=new Node("F");
		obj.root.right.right=new Node("G");
		
	}

}

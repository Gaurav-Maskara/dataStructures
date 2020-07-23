package com.gaurav.geeksForGeeks;

import java.io.Serializable;

public class GeekForGeeks_BinarySearchTree implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	
	public void printSmallestValue() {
		while(root.left!=null) {
			  root=root.left;
		}
		System.out.println(root.data);
	}
	
	
	
	public void searchValueNonRecursion(int dataToBeSearched) {
		Node temp=root;
		while(temp!=null) {
			if(temp.data==dataToBeSearched) {
				System.out.println("Data found"+dataToBeSearched);
				return;
			}
			else if(dataToBeSearched<temp.data) {
				temp=temp.left;
			}
			else if(dataToBeSearched> temp.data) {
				temp=temp.right;
			}
		}
		System.out.println("Sorry data is not found");
	}

	
	
	public static void main(String[] args) {
		
		GeekForGeeks_BinarySearchTree bt=new GeekForGeeks_BinarySearchTree();
	    bt.root=new Node(20);
	    
	    bt.root.left=new Node(8);
	    bt.root.left.left=new Node(4);
	    bt.root.left.right=new Node(12);
	    
	    bt.root.left.right.left=new Node(10);
	    bt.root.left.right.right=new Node(14);
	    
	    bt.root.right=new Node(22);
	    
	   // bt.printSmallestValue();
	    
	    bt.searchValueNonRecursion(99);
	    
	    
	}

}

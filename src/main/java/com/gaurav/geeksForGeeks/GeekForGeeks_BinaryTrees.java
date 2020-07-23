package com.gaurav.geeksForGeeks;

public class GeekForGeeks_BinaryTrees {

	Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	
	public void inorder(Node root) {
		// Inorder (Left, Root, Right)
		
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public void postorder(Node root) {
		// Postorder (Left, Right, Root) 
		
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	
	//(a) Inorder (Left, Root, Right) : 4 2 5 1 3
	//(b) Preorder (Root, Left, Right) : 1 2 4 5 3
	//(c) Postorder (Left, Right, Root) : 4 5 2 3 1
	
	public static void main(String args[]) {
		
		GeekForGeeks_BinaryTrees bt=new GeekForGeeks_BinaryTrees();
		bt.root= new Node(1);
		
		Node left=new Node(2);
		Node right =new Node(3);
		
		bt.root.left=left;
		bt.root.right=right;
		
	    bt.inorder(bt.root);
		
	}
	
	
	
	
}

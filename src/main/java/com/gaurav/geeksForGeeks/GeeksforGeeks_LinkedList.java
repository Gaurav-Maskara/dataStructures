package com.gaurav.geeksForGeeks;

import java.util.HashSet;
import java.util.Set;

public class GeeksforGeeks_LinkedList{
	
	Node head;
	Node tail;
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void insertAtStart(Node n) {
		n.next=head;
		head=n;
	}
	
	public void insertAtEnd(Node n) {
		Node temp=head;
		if(head==null) {
			head=n;
			return;
		}
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
	}
	
	
	public void insertAtlastUsingTail(Node n) {
		tail.next=n;
	}
	
	public void insertAtPosition(int data, Node n) {
		Node temp=head;
		
		while(temp.data!=data) {
			temp=temp.next;
		}
		
		n.next=temp.next;
		temp.next=n;
	}
	
	
	public void deleteNode(int dataToBeDeleted) {
		Node temp=head;
		Node pointer=temp;;
		while(temp!=null) {
			
			if(temp.data==dataToBeDeleted) {
				 break;
			}
			pointer=temp;
			temp=temp.next;
		}
		
		pointer.next=temp.next;
	}
	
	
	public void deleteNodeAtPosition(int position) {
		
		int counter=0;
		Node temp=head;
		Node pointer=null;
		
		while(counter!=position && temp!=null) {
			counter++;
			pointer=temp;
			temp=temp.next;
		}
		
		if(counter==position) {
			pointer.next=temp.next;
		}
	}
	
	public void findLength() {
		Node temp=head;
		int length=0;
		
		if(temp==null) {
			System.out.println("The length is :"+ 0);
		}
		
		while(temp!=null) {
			temp=temp.next;
			length++;
		}
		
		System.out.println("The length is :"+ length);
		
	}
	
	
	public void reverse() {
		Node previous=null;
		Node current=head;
		Node next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			
			current=next;
		}
		
		head=previous;
	}
	
	public void combineLinkedList(Node head1, Node head2) {
		
		Node temp=head1;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head2;
	}
	
	public void detectAndRemoveLoop() {
		
		Node temp=head;
		Node prev=null;
		Set<Node> hs=new HashSet<Node>();
		
		while(temp!=null) {
			
			if(hs.contains(temp)) {
				System.out.println("Loop Detected");
				prev.next=null;
				return;
			}
			else {
				hs.add(temp);
				prev=temp;
				temp=temp.next;
			}
		}
	}
	
	
	
	public static void main(String args[]) {
		
		GeeksforGeeks_LinkedList ll=new GeeksforGeeks_LinkedList();
		
	    ll.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		ll.head.next=second;
		second.next=third;
		
        third.next=ll.head;	
		
		ll.detectAndRemoveLoop();
		
		
		ll.print();
	}
	
	
	
}
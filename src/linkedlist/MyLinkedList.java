package linkedlist;

import java.util.LinkedList;
import java.util.List;

class Node{
	public int data;
	public Node next=null;
	
	public Node(int data) {
		this.data=data;
	}
}

public class MyLinkedList {
	
	private Node head;
	private Node tail;
	
	public MyLinkedList() {
		head = null;
		tail = null;
	}
	
	public void insert(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = node;
			tail = node;
		}else {
			tail.next=node;
			tail=node;
//			Node current = head;
//			
//			while(current.next != null) {
//				current= current.next;
//			}
//			current.next= node;
			
		}
	}
	
	public void insertAtFirst(int value) {
		Node node = new Node(value);
		if(isEmpty()) {
			head = tail = node;
		}else {
			node.next = head;
			head=node;
		}
	}
	
	public void insertingNodeAtSpecificIndex(int index, int value) {
		if(isEmpty()) throw new IllegalArgumentException();
		
		Node node = new Node(value);
		Node current = head;
		Node prev = null;
		
		if(index == 0) {
			insertAtFirst(value);
			return;
		}
		
		while(index > 0 && current != null) {
			prev = current;
			current = current.next;
			index--;
		}
		prev.next = node;
		node.next = current;
	}
	
	public int sumOfAllElements() {
		Node current = head;
		int sum =0;
		while(current != null) {
			sum += current.data;
			current = current.next;
		}
		return sum;
	}
	
	public int indexOf(int value) {
		Node current = head;
		int index=0;
		while(current != null) {
			if(current.data == value) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void reverse() {
		if(head == null || head.next == null)return;
		
		Node prev=null;
		Node current=head;
		Node next=head.next;
		
		while(next != null) {
			current.next=prev;
			prev=current;
			current=next;
			next=next.next;
		}
		current.next=prev;
		head=current;
	}
	
	public void deleteNodeFromFirst() {
		Node temp = head;
		head=head.next;
		temp.next=null;
	}
	
	public void deleteNodeFromLast() {
		//approach 1
//		Node current = head;
//		while(current.next != tail) {
//			current = current.next;
//		}
//		current.next=null;
//		tail=current;
		
		//approach 2
		
		Node curr = head;
		Node next = curr.next;
		while(next.next != null) {
			curr = curr.next;
			next = next.next;
		}
		curr.next=null;
		tail=curr;
	}
	
	public void removeNodeFromLastNthPosition(int n) {
		Node fast = head;
		Node current = head;
		Node prev = null;
		
		while(n > 1 && fast != null) {
			fast = fast.next;
			n--;
		}
		
		while(fast.next != null) {
			prev=current;
			current=current.next;
			fast=fast.next;
		}
		
		prev.next=current.next;
		current.next=null;
	}
	
	public void printRecursive(Node head) {
		if(head == null) return;
		
		System.out.print(head.data + "-->");
		
		printRecursive(head.next);
	}
	
	public void printRecursive1() {
		//to access private head
		//printRecursive(head);
		reverseRecursion(head);
	}
	
	public Node reverseRecursion(Node head) {
		if(head == null || head.next == null)return head;
		
		Node rest = reverseRecursion(head.next);
		
		Node next = head.next;
		next.next = head;
		head.next = null;
		
		return rest;
		
	}
	
	   public Node swapPairs(Node head) {
		   
		   //Leetcode question - 24
	        if(head == null || head.next == null) return head;

	        Node restOfTheList = swapPairs(head.next.next);

	        Node secondOne = head.next;
	        secondOne.next = head;
	        head.next = restOfTheList;

	        return secondOne;

	    }
	
	public String toString() {
		Node current = head;
		
		StringBuilder result = new StringBuilder();
		
		while(current != null) {
			result.append(current.data);
			if(current.next != null) {
				result.append("-->");
			}
			current = current.next;
		}
		
		return result.toString();
	}
	
}

package com.java.datastructure.linkedlist;

public class CountNodes {
	
	public static void main(String[] args) {
		Node head = LinkedList.newList1();
		System.out.println("The linked list is ::");
		LinkedList.display(head);
		int count = countNodes(head);
		System.out.println("Number of nodes in the linked list is :: "+count);
	}
	
	/*
	 * This method count the number of nodes in the 
	 * Linked List using looping statement
	 */
	public static int countNodes(Node head){
		int count = 0;
		while(head != null){
			count++;
			head = head.next;
		}
		return count;
	}
	
	/*
	 * This method count the number of nodes using 
	 * Recursion Method
	 */
	public static int countUsingRecursion(Node head){
		if(head == null)
			return 0;
		return 1+ countUsingRecursion(head.next);
	}
	
	/*
	 * This method uses alternative method
	 */
	public static int countUsingRecursion2(Node head){
		if(head == null)
			return 0;
		if(head.next == null)
			return 1;
		return 2 + countUsingRecursion2(head);
	}
}

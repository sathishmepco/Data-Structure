package com.java.datastructure.linkedlist;

/*
 * reverse the linked list
 */
public class ReverseList {
	public static void main(String[] args) {
		Node head = LinkedList.newList1();
		System.out.println("Before reverseing the list :: ");
		LinkedList.display(head);
		Node reversedList = reverseList(head);
		System.out.println("After reversing the list :: ");
		LinkedList.display(reversedList);
	}
	public static Node reverseList(Node head){
		Node newHead = null;
		while(head != null){
			Node temp = head.next;
			head.next = newHead;
			newHead = head;
			head = temp;
		}		
		return newHead;
	}
}
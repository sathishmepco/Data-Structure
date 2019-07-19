package com.java.datastructure.linkedlist;

/*
 * reverse the linked list
 * Given linked list is :: 1 2 3 4 5
 * After reverse the list :: 5 4 3 2 1 
 */
public class ReverseList {
	public static void main(String[] args) {
		Node head = LinkedList.newList1();
		System.out.println("Before reversing the list :: ");
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
/*
 * OUTPUT IS 
	Before reversing the list :: 
	10->20->30->40->50->Null
	After reversing the list :: 
	50->40->30->20->10->Null
*/

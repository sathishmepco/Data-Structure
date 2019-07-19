package com.java.datastructure.linkedlist;

/*
 * This program will find out the middle of the LinkedList
 * 10 20 30 40 50 in the linked list 
 * 30 is the middle element
 */
public class FindMiddleOfList {
	
	public static void main(String[] args) {
		Node head = LinkedList.newList1();
		System.out.println("The linked list is ::");
		LinkedList.display(head);
		int middleData = middleOfTheList(head);
		System.out.println("Middle Value is : "+middleData);
	}

	/*
	 * SLOW node will move one by one
	 * but FAST node will move two nodes for every iteration
	 * when FAST reach the end of the list SLOW node would be in the MIDDLE of the list
	 */
	public static int middleOfTheList(Node head){
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
}
/*
 *	OUTPUT

	The linked list is ::
	10->20->30->40->50->Null
	Middle Value is : 30
	
*/
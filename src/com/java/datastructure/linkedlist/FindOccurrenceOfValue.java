package com.java.datastructure.linkedlist;

/*
 * Find the occurrence of a given number
 * Given Linked List is :: 5 6 5 4
 * Given Number is 5 :: Occurrence is 2 times
 * Given Number is 6 :: Occurrence is 1 time
 * Given Number is 10 :: Occurrence is 0 times 
 */

public class FindOccurrenceOfValue {
	
	public static void main(String[] args) {
		Node head = LinkedList.newList2();
		System.out.println("The linked list is ::");
		LinkedList.display(head);
		int valueToSearch = 10;
		int count = findTheOccurrence(head, valueToSearch);
		System.out.println("Value "+valueToSearch+" is occurred "+count+" times.");
	}

	/*
	 * Traverse the linked list
	 * Check the value of every node
	 * Compare node value with given value
	 * If matched increment the counter, else do nothing
	 * Then move to the next node
	 */
	public static int findTheOccurrence(Node head, int value){
		int counter = 0;
		while(head != null){
			if(head.data == value)
				counter++;
			head = head.next;
		}
		return counter;
	}
}
/*
	OUTPUT
	
	The linked list is ::
	5->6->5->4->Null
	Value 5 is occurred 2 times.

	The linked list is ::
	5->6->5->4->Null
	Value 10 is occurred 0 times.
*/

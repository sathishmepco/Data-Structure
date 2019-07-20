package com.java.datastructure.linkedlist;


/*
 * Find the nth node from the linked list
 * Given list is 1 2 3 4 5
 * 3rd node in the list is :: 3
 * 5th node in the list is ::5
 */
public class FindNthNode {
	public static void main(String[] args) {
		Node head = LinkedList.newList1();
		System.out.println("The linked list is ::");
		LinkedList.display(head);
		int indexToSearch = 3;
		int nthNode = findNthNode(head, indexToSearch);
		System.out.println("Node in the "+indexToSearch+" index is :: "+nthNode);
	}
	
	public static int findNthNode(Node head, int index){
		int count = 0;
		while(head != null){
			count++;
			if(count == index)
				return head.data;
			head = head.next;
		}
		return -1;
	}
	
	

}
/*
 *	OUTPUT
 
	The linked list is ::
	10->20->30->40->50->Null
	Node in the 3 index is :: 30

*/
 

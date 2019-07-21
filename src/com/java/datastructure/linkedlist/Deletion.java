package com.java.datastructure.linkedlist;

public class Deletion {
	
	public static void main(String[] args) {
		Node head = LinkedList.newList1();
		System.out.println("The linked list is ::");
		LinkedList.display(head);
		
		//DELETE THE FIRST NODE
		System.out.println("After deleting the first Node ::");
		head = deleteTheFirstNode(head);
		LinkedList.display(head);
		
		//DELETE THE LAST NODE
		System.out.println("After deleting the Last Node ::");
		head = deleteTheLastNode(head);
		LinkedList.display(head);
		
		//DELETE THE NTH NODE
		int position = 2;
		System.out.println("After deleting node position "+position+" ::");
		head = deleteInTheMiddle(head, position);
		LinkedList.display(head);
	}

	/*
	 * Delete the first node of the list
	 * after deleting the first node, then immediate next node will become HEAD
	 * if the List is empty, we can't delete, return null
	 */
	public static Node deleteTheFirstNode(Node head){
		if(head == null){
			System.out.println("The list is EMPTY");
			return null;
		}
		System.out.println("The deleted node is :: "+head.data);
		return head.next;
	}
	
	public static Node deleteTheLastNode(Node head){
		if(head == null){
			System.out.println("The list is EMPTY");
			return null;
		}
		
		Node current = head.next;
		Node previous = head;
		//to find out the last node
		while(current.next != null){
			previous = current;
			current = current.next;
		}
		
		//now current is pointing to last node
		//previous node will point to the previous to last node 
		previous.next = null;
		return head;
	}

	public static Node deleteInTheMiddle(Node head, int position){
		if(head == null){
			System.out.println("The list is EMPTY");
			return null;
		}
		
		Node current = head;
		Node previous = null;
		int counter = 0;
		while(current != null){
			counter++;
			if(counter == position){
				if(previous == null)
					head = head.next;
				else
					previous.next = current.next;
				break;
			}
			previous = current;
			current = current.next;
		}
		return head;
	}
}
/*
	OUTPUT
	
	 The linked list is ::
	10->20->30->40->50->Null
	After deleting the first Node ::
	The deleted node is :: 10
	20->30->40->50->Null
	After deleting the Last Node ::
	20->30->40->Null
	After deleting node position 2 ::
	20->40->Null
*/
 

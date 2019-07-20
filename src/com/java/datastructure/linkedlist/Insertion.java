package com.java.datastructure.linkedlist;

public class Insertion {
	
	public static void main(String[] args) {
		Node head = LinkedList.newList1();
		System.out.println("The linked list is ::");
		LinkedList.display(head);
		
		//INSERT AT THE FRONT
		Node frontNode = new Node(100);
		head = insertAtFront(head, frontNode);
		System.out.println("After inserting 100 at the front ::");
		LinkedList.display(head);
		
		//INSERT AT THE LAST
		Node lastNode = new Node(500);
		head = insertAtLast(head, lastNode);
		System.out.println("After inserting 500 at the last ::");
		LinkedList.display(head);
		
		//INSERT AT MIDDLE OF THE LIST
		Node middleNode = new Node(1000);
		head = insertInTheMiddle(head, middleNode, 4);
		System.out.println("After inserting 1000 in the 4 th place ::");
		LinkedList.display(head);
	}
	
	public static Node insertAtFront(Node head,Node nodeToInsert){
		//insert at front means, new node will become the head
		//the head will follow the new node
		nodeToInsert.next = head;
		
		//now nodeToInsert is the head node
		//return the new head node
		return nodeToInsert;
	}
	
	public static Node insertAtLast(Node head, Node nodeToInsert) {
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		//now reached the last node, so add the new node at last
		temp.next = nodeToInsert;
		
		//return the head node
		return head;
	}
	
	public static Node insertInTheMiddle(Node head,Node nodeToInsert,int position){
		//create counter to find out the position of the node 
		int counter = 0;
		// copy the head node to another variable, so that head node will not modified
		Node current = head;
		//traverse the linked list until you get the position
		while(current != null){
			counter++;
			//when you reach the position, add the node
			if(counter == position){
				Node temp = current.next;
				current.next = nodeToInsert;
				nodeToInsert.next = temp;
				break;
			}
			//move to next node in the traversal
			current = current.next;
		}
		return head;
	}
}
/*
	OUTPUT
	
	The linked list is ::
	10->20->30->40->50->Null
	After inserting 100 at the front ::
	100->10->20->30->40->50->Null
	After inserting 500 at the last ::
	100->10->20->30->40->50->500->Null
	After inserting 1000 in the 4 th place ::
	100->10->20->30->1000->40->50->500->Null
	
*/
 

package com.java.datastructure.linkedlist;

public class LinkedList {
	
	public static Node newList1(){
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		return head;
	}
	
	public static Node newList2(){
		Node head = new Node(5);
		head.next = new Node(6);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		return head;
	}
	
	public static void display(Node node){
		while(node != null){
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.print("Null\n");
	}
}

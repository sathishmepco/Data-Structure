package com.java.datastructure.stack;

public class StackMain {
	public static void main(String[] args) {
		Stack stack = new Stack(3);

		stack.push(1);		// Inserting 1 in the stack
		stack.push(2);		// Inserting 2 in the stack

		stack.pop();		// removing the top 2
		stack.pop();		// removing the top 1

		stack.push(3);		// Inserting 3 in the stack

		System.out.println("Top element is: " + stack.peek());
		System.out.println("Stack size is " + stack.size());

		stack.pop();		// removing the top 3

		// check if stack is empty
		if (stack.isEmpty())
			System.out.println("Stack Is Empty");
		else
			System.out.println("Stack Is Not Empty");
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		if(stack.isFull())
			System.out.println("Stack is Full!");
		else
			System.out.println("Stack is Not Full!");
	}
}
/*

	Output 
	
	Inserting data :1
	Inserting data :2
	Removing 2
	Removing 1
	Inserting data :3
	Top element is: 3
	Stack size is 1
	Removing 3
	Stack Is Empty
	Inserting data :10
	Inserting data :20
	Inserting data :30
	Stack is Full!

 */
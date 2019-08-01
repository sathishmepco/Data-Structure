package com.java.datastructure.stack;

public class Stack {
	
	private int array[];
	private int top;
	private int capacity;
	
	public Stack(int size){
		capacity = size;
		array = new int[size];
		top = -1;
	}
	
	public void push(int data){
		if(isFull()){
			System.out.println("Stack is Full!");
			return;
		}
		System.out.println("Inserting data :"+data);
		array[++top] = data;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty!");
			return -1;
		}
		System.out.println("Removing " + peek());
		return array[top--];
	}
	
	public int peek(){
		if(isEmpty()){
			return -1;
		}
		return array[top];
	}
	
	public int size(){
		return top+1;
	}
	
	public boolean isFull(){
		return top == capacity-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
}
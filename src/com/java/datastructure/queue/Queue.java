package com.java.datastructure.queue;

//Queue implementation in java
public class Queue {
	
	private int arr[];         // array to store Queue elements
	private int front;         // front points to front element in the Queue
	private int rear;          // rear points to last element in the Queue
	private int capacity;      // maximum capacity of the Queue
	private int count;         // current size of the Queue
	
	// Constructor to initialize the Queue
	public Queue(int size)
	{
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	// Method to remove the element from the Queue
	public void dequeue()
	{
		// check queue is empty or not
		if (isEmpty())
		{
			System.out.println("Queue is empty!");
			return;
		}

		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	// method to add an element to the Queue
	public void enqueue(int item)
	{
		// check the Queue is Full or not
		if (isFull())
		{
			System.out.println("Queue is Full!");
			return;
		}

		System.out.println("Inserting " + item);
		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	// method to read the front element from the Queue
	public int peek()
	{
		if (isEmpty()) 
		{
			System.out.println("Queue is empty!");
			return -1;
		}
		return arr[front];
	}

	// this method returns the size of the Queue
	public int size()
	{
		return count;
	}

	// method to check the Queue is empty or not
	public Boolean isEmpty()
	{
		return (size() == 0);
	}

	// method to check the Queue is Full or not
	public Boolean isFull()
	{
		return (size() == capacity);
	}
}
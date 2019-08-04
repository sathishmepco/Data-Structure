package com.java.datastructure.queue;
//Queue implementation in java
//FIRST IN FIRST OUT - FIFO
//LAST IN LAST OUT - LILO
public class QueueMain {
	
	public static void main (String[] args)
	{
		// Creating Queue of capacity 4
		Queue q = new Queue(4);

		//inserting elements into the Queue (at the REAR)
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println("Front element is: " + q.peek());
		
		//removing the element (obvious deletion will happened at Front)
		q.dequeue();
		System.out.println("Front element is: " + q.peek());

		System.out.println("Queue size is " + q.size());

		q.dequeue();
		q.dequeue();
		
		if (q.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
	}
}
/*
	OUTPUT
	
	Inserting 1
	Inserting 2
	Inserting 3
	Front element is: 1
	Removing 1
	Front element is: 2
	Queue size is 2
	Removing 2
	Removing 3
	Queue Is Empty
*/
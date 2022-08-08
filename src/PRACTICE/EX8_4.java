package PRACTICE;

import java.util.PriorityQueue;

public class EX8_4 {
	
	public static void main(String[] args) {
		
		//Creating a priority Queue
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		//using the add() method
		
		queue.add(4);
		queue.add(2);
		System.out.println("Priority Queue " + queue);
		
		// Using the offer() method
		queue.offer(1);
		System.out.println("Updated PriorityQueue: " + queue);

	}

}

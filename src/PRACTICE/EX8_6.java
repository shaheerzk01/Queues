package PRACTICE;

import java.util.PriorityQueue;

public class EX8_6 {

	public static void main(String[] args) {
		
		//Creating a priority Queue
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
				
		//using the add() method
				
		queue.add(4);
		queue.add(2);
		queue.add(1);
		System.out.println("Priority Queue " + queue);
		
		//Using the remove() method
		boolean result = queue.remove(2);
		System.out.println("Is the element 2 removed? " + result);
		
		//Using the poll() method
		
		int number = queue.poll();
		System.out.println("Removed Element Using poll(): " + number);

	}

}

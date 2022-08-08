package PRACTICE;

import java.util.Queue;
import java.util.PriorityQueue;

public class EX8_3 {
	
	public static void main(String[] args) {
		// Creating Queue using the PriorityQueue class
		Queue<Integer> queue = new PriorityQueue<>();
		
		// offer elements to the Queue
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		
		// Access elements of the Queue
		int accessedNumber = queue.peek();
		System.out.println("Accessed Element: " + accessedNumber);
		
		// Remove elements from the Queue
		int removedNumber = queue.poll(); 
		System.out.println("Removed Element: " + removedNumber);
		System.out.println("Updated Queue: " + queue);
	
	}

}

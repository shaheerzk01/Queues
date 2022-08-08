package PRACTICE;

import java.util.Queue;
import java.util.LinkedList;

public class EX8_1 {
	
	public static void main(String[] args) {
		
		// Creating Queue using the LinkedList class
		Queue<Integer> queue = new LinkedList<>();
		
		// offer elements to the Queue
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println("Queue: " + queue);
		
		// Access elements of the Queue
		int accessednumber = queue.peek();
		System.out.println("Accessed Element: " + accessednumber);
		
		// Remove elements from the Queue
		int removedNumber = queue.poll(); 
		System.out.println("Removed Element: " + removedNumber);
		
		System.out.println("Updated Queue: " + queue);
		

	}

}

package PRACTICE;

import java.util.PriorityQueue; 
import java.util.Iterator;

public class EX8_7 {

	public static void main(String[] args) {
		//Creating a priority Queue
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
				
		//using the add() method
				
		queue.add(4);
		queue.add(2);
		queue.add(1);
		System.out.println("Priority Queue " + queue);
		
		System.out.println("Priority Queue using Iterator(): ");
		
		//Using the iterator() method
		Iterator<Integer> iterate = queue.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	
	}

}

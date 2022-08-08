package PRACTICE;

import java.util.PriorityQueue;

public class EX8_5 {
	
    public static void main(String[] args) {
		
		//Creating a priority Queue
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		//using the add() method
		
		queue.add(4);
		queue.add(2);
		queue.add(1);
		System.out.println("Priority Queue " + queue);
		
		//Using the peek() method
	    int number = queue.peek();
	    System.out.println("Accessed Element: " + number);
	  
}

}

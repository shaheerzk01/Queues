package PRACTICE;

import java.util.PriorityQueue; 
import java.util.Comparator;

public class EX8_8 {
	
     public static void main(String[] args) {
		
		//Creating a priority Queue
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		//using the add() method
		
		queue.add(4);
		queue.add(2);
		queue.add(1);
		queue.add(3);
		System.out.println("Priority Queue " + queue);
		
     }

}

class CustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer number1, Integer number2) {
		int value = number1.compareTo(number2);
		//element are sorted in reverse order
		if(value > 0) {
			return -1;
		}
		else if(value < 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

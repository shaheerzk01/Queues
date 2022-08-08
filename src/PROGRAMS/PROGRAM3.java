package PROGRAMS;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PROGRAM3 {
	
	 public static void main(String[] args) {
		    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
			
			PROGRAM3_2 queue1 = new PROGRAM3_2();
			
			Scanner input = new Scanner(System.in);
			
			for(int i=0; i<=3; i++ ) {
				System.out.println("Enter your age");
				int q = input.nextInt();
				queue.add(q);
			}

		    queue1.enqueue(1);
		    queue1.enqueue(2);
		    queue1.enqueue(3);
		    queue1.enqueue(4);
			for(int i=0; i<=3; i++ ) {
				System.out.print(queue.poll() + " [age]");
				System.out.println(" token number is " + queue1.dequeue());
			}
	 }
}

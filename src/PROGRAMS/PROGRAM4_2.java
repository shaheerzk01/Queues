package PROGRAMS;

import java.util.PriorityQueue;

public class PROGRAM4_2 {

	public static void main(String[] args) {
		
        PriorityQueue<PROGRAM4> pq = new 
             PriorityQueue<PROGRAM4>(5, new PROGRAM4_3());
                  
               
        PROGRAM4  p1 = new PROGRAM4("Manager", 2);
        pq.add(p1);
        PROGRAM4 p2 = new PROGRAM4("Employee", 4);
        pq.add(p2);
        PROGRAM4 p3 = new PROGRAM4("Employee" ,5);
        pq.add(p3);
        PROGRAM4 p4 = new PROGRAM4("Employee" ,6);
        pq.add(p4);         
        PROGRAM4 p5 = new PROGRAM4("helper", 8);
        pq.add(p5);
        System.out.println("Printer used by any person in the firm in their priority order");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getName());               
        } 
    }

}

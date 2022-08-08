package PROGRAMS;

public class PROGRAM5 {
	
	private int[] arr;  
	private int front;  
	private int rear;    
	private int capacity;  
	private int count;     
	
	PROGRAM5(int size){
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	
	// Utility function to dequeue the front element
	public int dequeue() {
		// check for queue underflow
		if(isEmpty()) {
			System.out.println("Underflow\nProgram Terminated");
			System.exit(-1);
		}
		
		int x = arr[front];
		
		front = (front + 1) % capacity;
		
		count--;
		
		return x;
	}
	
	// Utility function to add an item to the queue
	public void enqueue(int item) {
		// check for queue overflow
		if(isFull()) {
			System.out.println("Overflow\nProgram Terminated");
			System.exit(-1);
		}
		
		System.out.println("Inserting " + item);
		
		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}
	
	// Utility function to check if the queue is empty or not
	public boolean isEmpty() {
		return (count == 0);
	}
	
	// Utility function to check if the queue is full or not
	public boolean isFull() {
		return (count == capacity); 
		}
}

class Main{
	public static void main (String[] args) {
		// create a queue of capacity 5
		PROGRAM5 queue = new PROGRAM5(5);
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println("Clearing queue");
		while(!queue.isEmpty()) {
			queue.dequeue();
		}
		
		if (queue.isEmpty()) {
			System.out.println("The queue is empty");
			} 
		else {
			System.out.println("The queue is not empty"); }
		
	}
}

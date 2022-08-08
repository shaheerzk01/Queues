package PRACTICE;

public class EX8_2 {
	
	private int[] arr;  //array to store queue elements
	private int front;  //fronts points to the front element of the queue
	private int rear;    //rear points to the last element of the queue
	private int capacity;  //maximum capacity  of the queue
	private int count;     //current size of the queue
	
	// Constructor to initialize a queue
	
	EX8_2(int size){
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
		
		System.out.println(" Removing " + x );
		
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
	
	// Utility function to return the front element of the queue
	public int peek() {
		if(isEmpty()) {
			System.out.println("Underflow\nProgram Terminated");
			System.exit(-1);
		}
		return arr[front];
	}
	// Utility function to return the size of the queue
	public int size() {
		return count;
	}
	
	// Utility function to check if the queue is empty or not
	public boolean isEmpty() {
		return (size() == 0);
	}
	
	// Utility function to check if the queue is full or not
	public boolean isFull() {
		return (size() == capacity); 
		}
}

class Main{
	public static void main (String[] args) {
		// create a queue of capacity 5
		EX8_2 queue = new EX8_2(5);
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println("The front element is " + queue.peek()); 
		queue.dequeue();
		System.out.println("The front element is " + queue.peek());
		
		System.out.println("The queue size is " + queue.size());
		
		queue.dequeue();
		queue.dequeue();
		
		
		if (queue.isEmpty()) {
			System.out.println("The queue is empty");
			} 
		else {
			System.out.println("The queue is not empty"); }
		
	}
}

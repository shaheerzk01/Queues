package PROGRAMS;

public class PROGRAM3_2 {
	
	private int[] q;
	private int total;
	private int size;
	private int front;
	private int rear;
	
	public PROGRAM3_2() {
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[size];
	}
	public boolean enqueue(int item) {
		if(isFull()) {
			return false;
		}else {
			total++;
			q[rear] = item;
			rear++;
			return true;
		}
	}
	
	public int  dequeue() {
		int item  = q[front];
		total--;
		front++;
		return item;
	}
	
	public boolean isFull() {
		return (total == size);
	}
	
}



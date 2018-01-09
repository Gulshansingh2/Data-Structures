package queue;

public class IntQueue {

	private int[] queue;
	private int total, size, front, rear;
	
	public IntQueue(){
		total = 0;
		front = 0 ;
		rear = 0;
		size = 50;
		queue = new int [size];
	}
	
	public IntQueue(int size){
		total = 0;
		front = 0 ;
		rear = 0;
		this.size = size;
		queue = new int [this.size];
	}
	public boolean enqueue(int item){
		if(!isFull()){
			total++;
			queue[rear] = item;
			rear = (rear + 1)%size;
			return true;
		}
		else{
			System.out.println("Queue is full");
			return false;	
		}
	}
	public Integer dequeue() {
		if(!isEmpty()){
			int item = queue[front];
			total--;
			front = (front + 1)%size;
			return item;
		}
		else{
			System.out.println("Queue is empty");
			return null;	
		}
	}
	public boolean isFull(){
		return (size == total);
	}
	public boolean isEmpty(){
		return (total == 0);
	}
	public void showAll() {
		int f = front;
		if(total != 0){
			for (int i = 0; i < total; i++){
			System.out.println(" " + queue[f]);
			f = (f + 1) % size;
			}
		}
	}
}

package queue;

public class PersonQueue {

	private Person[] queue;
	private int total, size, front, rear;
	
	public PersonQueue(){
		total = 0;
		front = 0 ;
		rear = 0;
		size = 50;
		queue = new Person [size];
	}
	
	public PersonQueue(int size){
		total = 0;
		front = 0 ;
		rear = 0;
		this.size = size;
		queue = new Person [this.size];
	}
	public boolean enqueue(Person person){
		if(!isFull()){
			total++;
			queue[rear] = person;
			rear = (rear + 1)%size;
			return true;
		}
		else{
			System.out.println("Queue is full");
			return false;	
		}
	}
	public Person dequeue() {
		if(!isEmpty()){
			Person item = queue[front];
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
	}}

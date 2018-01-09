package queue;

public class Main {

	public static void main(String[] args) {
		IntQueue intQueue = new IntQueue();
	
		intQueue.enqueue(2);
		intQueue.enqueue(4);
		intQueue.enqueue(6);
		intQueue.enqueue(8);
		intQueue.enqueue(10);
		
		System.out.println(intQueue.dequeue());
		intQueue.showAll();
		
//		Person person1 = new Person("cam", "111");
//		Person person2 = new Person("mac", "121");
//		
//		PersonQueue pQueue = new PersonQueue();
//		
//		pQueue.enqueue(person1);
//		pQueue.enqueue(person2);
//		
//		System.out.println(pQueue.dequeue());
//		System.out.println(pQueue.dequeue());
//		System.out.println(pQueue.dequeue());
	}

}

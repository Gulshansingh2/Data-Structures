package stack;

public class Main {

	public static void main(String[] args) {
//		IntStack intStack = new IntStack();
//		if(!intStack.isFull()){
//			intStack.push(2);
//			intStack.push(4);
//			intStack.push(6);
//			intStack.push(8);
//		}
//		
//		System.out.println(intStack.pop());
//		System.out.println(intStack.pop());
		
		Person person1 = new Person("cam", "111");
		Person person2 = new Person("mac", "121");
		
		PersonStack pStack = new PersonStack();
		
		pStack.push(person1);
		pStack.push(person2);
		
		System.out.println(pStack.pop());
		System.out.println(pStack.pop());
		System.out.println(pStack.pop());
	}

}

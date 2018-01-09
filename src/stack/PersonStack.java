package stack;

public class PersonStack {

	private Person[] stack;
	private int top, size;
	
	public PersonStack(){
		top = -1;
		size = 50;
		stack = new Person [size];
	}
	
	public PersonStack(int size){
		top = -1;
		this.size = size;
		stack = new Person [this.size];
	}
	public boolean push(Person item){
		if(!isFull()){
			top++;
			stack[top] = item;
			return true;	
		}
		return false;
	}
	public Person pop() {
		if(!isEmpty())
			return stack[top--];
		else
			System.out.println("Stack is empty");
		return null;
	}
	public boolean isFull(){
		return (top == stack.length-1);
	}
	public boolean isEmpty(){
		return (top == -1);
	}
}

package stack;

public class IntStack {

	private int[] stack;
	private int top, size;
	
	public IntStack(){
		top = -1;
		size = 50;
		stack = new int [size];
	}
	
	public IntStack(int size){
		top = -1;
		this.size = size;
		stack = new int [this.size];
	}
	public boolean push(int item){
		if(!isFull()){
			top++;
			stack[top] = item;
			return true;	
		}
		return false;
	}
	public Integer pop() {
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

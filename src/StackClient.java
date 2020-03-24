
public class StackClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack myStack = new Stack(5);
		myStack.printStack();
		
		// adding elements:
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		// myStack.push(6);		// out of bounds if starting with 5 elements
		
		// removing elements
		myStack.pop();
		myStack.pop();
	
		// System.out.println("After myStack.pop():");
		myStack.printStack();
		
		// look at top element
		System.out.println("myStack.peek(): " + myStack.peek());
		
		
	}

}

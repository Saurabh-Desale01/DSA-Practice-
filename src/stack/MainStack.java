package stack;

import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack(5);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(7);
		//stack.push(8);
		
		//System.out.println(stack.pop());
		//System.out.println(stack.peek());
		
		Stack<Integer> newStack = new Stack<>();
		
		newStack.push(1);
		newStack.push(7);
		newStack.push(2);
		newStack.push(4);
		newStack.push(0);
		
		//stack.insertAtBottom(newStack);
		
		//stack.reverseStack(newStack);
		
		stack.sort(newStack);
		
		System.out.println(newStack);
	}
}

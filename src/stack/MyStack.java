package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {

	private int[] item;
	private int top;
	private int size;
	
	
	public MyStack(int size) {
		this.size=size;
		this.item = new int[size];
		this.top=0;
		
	}
	
	public void push(int value) {
		if(top == size) {
			//System.out.println("Stack is full");
			 throw new StackOverflowError();
			
		}
		item[top]=value;
		top++;
	}
	
	public int pop() {
		if(top == 0) {
			//System.out.println("Stack is empty");
			throw new EmptyStackException();
		}
		top--;
		int val = item[top];
		item[top]=0;
		return val;
	}
	
	public int peek() {
		if(top ==0) {
			System.out.println("Stack is empty");
			return -1;
		}
		return item[top-1];
	}
	
	public Stack insertAtBottom(Stack<Integer> myStack, int val) {
	
		if(myStack.isEmpty()) {
			myStack.push(val);
			return myStack;
		}else {
			int temp = myStack.pop();
			myStack = insertAtBottom(myStack, val);
			myStack.push(temp);
		}
		return myStack;
	}
	
	public Stack reverseStack(Stack<Integer> myStack) {
		
		if(myStack.isEmpty()) {
			//myStack.push(val);
			return myStack;
		}else {
			int temp = myStack.pop();
			reverseStack(myStack);
			insertAtBottom(myStack, temp);
		}
		return myStack;
	}
	
	public void insertSorted(Stack<Integer> stack, int val) {
		if(stack.isEmpty()) {
			stack.push(val);
			return;
		}
		
		int top = stack.peek();
		if(top <= val) {
			stack.push(val);
		}else {
			stack.pop();
			insertSorted(stack, val);
			stack.push(top);
		}
	}
	
	public void sort(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		
		int num = stack.pop();
		sort(stack);
		insertSorted(stack, num);
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		
		for(int i=size-1; i>=0; i--) {
			string.append(item[i]).append("\n");
		}
		return string.toString();
	}
	
	
}

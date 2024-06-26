package queue;

import java.util.Arrays;
import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public QueueUsingStack() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
		
	}
	
	public void enqueue(int val) {
			s1.push(val);
	}
	
	public int dequeue() {
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		if(s2.isEmpty()) {
			
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
		
	}
	
//	public String toString() {
//		return Arrays.toString(s2);
//	}
}

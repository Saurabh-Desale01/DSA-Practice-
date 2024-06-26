package queue;

public class MainQueue {

	//add/offer = both use for adding element but offer didn't throw exception if queue is full
	//remove/poll = both use for remove element but poll didn't throw exception if queue is empty
	public static void main(String[] args) {
		
//		MyQueue queue = new MyQueue(3);
//		
//		queue.enqueue(1);
//		queue.enqueue(2);
//		queue.enqueue(3);
//		//queue.enqueue(4);
//		
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
//		
//		queue.enqueue(4);
//		
//		System.out.println(queue.dequeue());
//		
//		queue.enqueue(5);
//		
//		System.out.println(queue);
		
		
		//Queue using stack
//		QueueUsingStack queueUsingStack = new QueueUsingStack();
//		
//		queueUsingStack.enqueue(1);
//		queueUsingStack.enqueue(2);
//		queueUsingStack.enqueue(3);
//		queueUsingStack.enqueue(4);
//		
//		System.out.println(queueUsingStack.dequeue());
//		System.out.println(queueUsingStack.dequeue());
		
		//priority queue methods 
		MyQueue queue = new MyQueue(7);
		
		queue.priorityEnqueue(11);
		queue.priorityEnqueue(1);
		queue.priorityEnqueue(10);
		queue.priorityEnqueue(-1);
		queue.priorityEnqueue(5);
		queue.priorityEnqueue(33);
		queue.priorityEnqueue(2);
		
		System.out.println(queue);
		
	}
	
}

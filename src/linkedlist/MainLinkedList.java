package linkedlist;

public class MainLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		
		list.insertAtFirst(0);
		list.insertAtFirst(-1);
		
		list.insertingNodeAtSpecificIndex(2, 35);
		
		System.out.println(list.sumOfAllElements());
		
		System.out.println(list.indexOf(1));
		
		System.out.println(list.isEmpty());
	
		//System.out.println(list);
		
		//list.reverse();
		
		//list.deleteNodeFromFirst();
		
		//list.deleteNodeFromLast();
		
		//list.removeNodeFromLastNthPosition(3);
		
		//System.out.println(list);
		
		list.printRecursive1();
		System.out.println(list);
		
		

	}

}

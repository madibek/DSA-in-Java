package malgara.kz;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {

		System.out.println("*** Doubly LinkedList demo ***");
		DoublyLinkedList list = new DoublyLinkedList();
		
		int remove = 20;
		if (list.remove(remove)) {
			System.out.println("List is empty");	
				
		}

		System.out.println("Starting add items...");	
		list.add(10);
		remove = 10;
		if (list.remove(remove)) {
			System.out.println(remove + " --> Head and Tail node is removed");	
			list.traverse();
			System.out.println("Empty list");	
			
		}



		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		
		list.traverse();

		list.reverseTraverse();

		int search = 22;
		if (!list.contains(search)) {
			System.out.println(search + " not found is the list");		
		}

		search = 50;
		if (list.contains(search)) {
			System.out.println(search + " found is the list");		
		}

		remove = 20;
		if (list.remove(remove)) {
			System.out.println(remove + " --> Head node is removed");	
				
		}

		remove = 90;
		if (list.remove(remove)) {
			System.out.println(remove + " --> Tail node is removed");	
				
		}

		remove = 60;
		if (list.remove(remove)) {
			System.out.println(remove + " --> middle node is removed");	
				
		}

		remove = 99;
		if (!list.remove(remove)) {
			System.out.println(remove + " --> doesn't contain in the list ");	
				
		}

		list.traverse();

		
	}
}

class Node {

	Node next;
	Node prev;
	int value;

	Node(int value) {
		this.value = value;			
	}
}

class DoublyLinkedList {

	Node head;
	Node tail;

	public void add(int value) {
		
		Node node = new Node(value);
		
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
			
		}		

	}

	public boolean contains(int value) {

		Node node = head;
		while(node != null && node.value != value) {
			node = node.next;
		}		
 
		return node != null;
	}

	public boolean remove(int value) {

		if (head == null) {
			// case 1 list is empty
			return false;
		}

		if (head.value == value) {
			
			if (head == tail) {

				// case 2 list contains only one node
				head = null;
				tail = null;
			} else {
				// case 3 remove head node
				head = head.next;
				head.prev = null;
			}

			return true;
		}

		Node node = head.next;
		while(node != null && node.value != value) {
			node = node.next;
		}

		if (node == tail) {
			// case 4 remove tail node
			tail = node.prev;
			tail.next = null;
			return true;
		} else if (node != null) {
			// case 5 remove node in between head and tail
			node.prev.next = node.next;
			node.next.prev = node.prev;
			return true;
		}
		
		// case 6 value not found in the list
		return false;
		

	}

	public void traverse() {
	
		System.out.println("List items:");
		Node node = head;
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}

	}

	public void reverseTraverse() {
		
		System.out.println("Reverse traversing. List items:");
		Node node = tail;
		while(node != null) {
			System.out.println(node.value);
			node = node.prev;
		}
	}































	
}

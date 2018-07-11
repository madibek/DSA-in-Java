package malgara.kz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	SingleLinkedList list = new SingleLinkedList();

	if (!list.remove(1)) {
		System.out.println("List is empty");
	}

	list.add(1);
	if (list.remove(1)) {
		System.out.println("Fist and last element removed");
	}
	list.traverse();

	list.add(2);
	list.add(3);
        list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	
	list.traverse();
	int search = 20;
	if (list.contains(search)) {
		System.out.println(search + " is found in the list");
	} else {
		System.out.println(search + " is not found.");
	}

	if (list.remove(2)) {
		System.out.println("2 Fist element removed");
	}

	if (list.remove(5)) {
		System.out.println("5 middle element removed");
	}

	if (list.remove(9)) {
		System.out.println("9 last element removed");
	}

	if (!list.remove(60)) {
		System.out.println("60 element not found");
	}

	list.traverse();
    }
}

class Node {
	int value;
	Node next;
	Node(int val) {
		this.value = val;
	}
}

class SingleLinkedList {
	Node head;
	Node tail;

  void add(int value) {
	System.out.println("add calling...");
	Node node = new Node(value);
	if (head == null) {
		head = node;
		tail = node;
	} else {
		tail.next = node;
		tail = node;
	}
  }

  void traverse() {
	
	System.out.println("Linked list items:");
	Node node = head;
	while(node != null) {
		System.out.println(node.value);
		node = node.next;
	}
  }

  boolean contains(int value) {
	
	Node node = head;
	while(node != null && node.value != value) {
		node = node.next;
	}

	return node != null;
  }

  boolean remove(int value) {

	if (head == null) {
		// case 1 list is empty
		return false;
	}

	if (head.value == value) {
		if (head == tail) {
			// case 2 node we are removing is head and tail			
			head = null;
			tail = null;		
		} else {
			// case 3 node we are removing is head
			head = head.next;
		}
		
		return true;
	}

	Node node = head;
	while(node.next != null && node.next.value != value) {
		node = node.next;
	}

	if (node.next != null) {
		if (node.next == null) {
			// case 4 node we are removing is tail node
			tail = node;
		} else {
			// case 5 node we are removing is in between head and tail node
			node.next = node.next.next;	
		}

		return true;
		
	}


	// case 6 node we are removing is not found
	return false;

  }
}




























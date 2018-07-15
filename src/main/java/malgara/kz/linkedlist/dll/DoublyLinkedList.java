package malgara.kz.linkedlist.dll;

import malgara.kz.linkedlist.Node;

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

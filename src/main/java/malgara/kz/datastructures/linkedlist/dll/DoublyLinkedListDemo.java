package malgara.kz.datastructures.linkedlist.dll;

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

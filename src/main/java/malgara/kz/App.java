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
	list.add(1);
    }
}

class Node {
	int value;
	Node next;
}

class SingleLinkedList {
	Node head;
	Node tail;

  void add(int value) {
	System.out.println("add calling...");
  }
}

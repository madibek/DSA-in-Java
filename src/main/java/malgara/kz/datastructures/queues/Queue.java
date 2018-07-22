package malgara.kz.datastructures.queues;

import malgara.kz.datastructures.linkedlist.Node;

public class Queue {

    Node head;
    Node tail;
    int count;

    public void enqueue(int value) {
        addLast(value);
    }

    private void addLast(int value) {

        if (head == null) {
            head = new Node(value);
            tail = head;
        } else {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
        }
        count++;
    }

    public int dequeue() {

        return removeFirst();
    }

    private int removeFirst() {

        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }

        int value = head.value;
        if (head.next == null) {
            head = null;
        } else {

            head = head.next;
        }
        count--;
        return value;
    }

    public int peek() {

        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }
        return head.value;
    }

    public int size() {
        return count;
    }

    public void clear() {

        head = null;
        count = 0;
    }

    public void traverse() {

        if (head == null) {
            return;
        }

        System.out.println("Queue items: ");
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public boolean hasMore() {
        return count > 0;
    }
}

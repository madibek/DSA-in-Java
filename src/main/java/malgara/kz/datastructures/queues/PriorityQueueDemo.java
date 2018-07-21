package malgara.kz.datastructures.queues;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        System.out.printf(PriorityQueueDemo.class.getName());

        PriorityQueue queue = new PriorityQueue();
        queue.enqueue(9);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(5);

        queue.traverse();

        System.out.printf("\nDequeue: " + queue.dequeue());
        System.out.printf("\nPeek: " + queue.peek());
        System.out.printf("\nDequeue: " + queue.dequeue());
        queue.enqueue(2);
        System.out.printf("\nDequeue: " + queue.dequeue());
        System.out.printf("\nPeek: " + queue.peek());

        System.out.println("\nQueue size: " + queue.size());
        queue.traverse();
    }
}

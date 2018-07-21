package malgara.kz.datastructures.queues;

public class QueuesDemo {

    public static void main(String[] args) {

        System.out.println(QueuesDemo.class.getName());

        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(40);
        queue.enqueue(20);
        queue.enqueue(90);
        System.out.println("deque: " + queue.dequeue());
        queue.traverse();
        queue.enqueue(70);
        queue.enqueue(80);
        System.out.println("peek : " + queue.peek());
        System.out.println("deque: " + queue.dequeue());
        System.out.println("peek : " + queue.peek());
        queue.traverse();
        System.out.println("Queue size: " + queue.size());
        queue.clear();
        System.out.println("Queue size: " + queue.size());
        try {
            queue.dequeue();
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

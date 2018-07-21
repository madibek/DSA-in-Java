package malgara.kz.datastructures.queues;

public class PriorityQueue {

    private int[] heap = new int[10];
    private int count = 0;

    public PriorityQueue() {

    }

    public PriorityQueue(int lenght) {
        heap = new int[lenght];
    }

    public void enqueue(int value) {

        if (count >= heap.length) {
            throw new RuntimeException("Queue is full");
        }

        heap[count] = value;
        count++;
        minHeapify();
    }

    public int dequeue() {

        if (count <= 0) {
            throw new RuntimeException("Queue is empty");
        }

        int value = heap[0];
        remove(value);
        return value;
    }

    public void traverse() {

        System.out.println("Queue items: ");
        int i = 0;
        while (i < count) {
            System.out.println(heap[i]);
            i++;
        }
    }

    public int peek() {

        if (count <= 0) {
            throw new RuntimeException("Queue is empty");
        }

        return heap[0];
    }

    public int size() {

        return count;
    }

    private boolean remove(int value) {

        int index = findIndex(value);
        if (index < 0) {
            return false;
        }

        count = count - 1;
        heap[index] = heap[count];
        int left = getLeft(index);
        int right = getRight(index);

        while (left < count && (heap[index] > heap[left] || heap[index] > heap[right])) {

            if (heap[left] < heap[right]) {
                swap(left, index);
                index = left;
            } else {
                swap(right, index);
                index = right;
            }

            left = getLeft(index);
            right = getRight(index);
        }

        return true;

    }

    private int getRight(int index) {
        return (index * 2) + 2;
    }

    private int getLeft(int index) {
        return (index * 2) + 1;
    }

    private int findIndex(int value) {

        int i = 0;
        while (i < count && heap[i] != value) {
            i++;
        }

        return i < count ? i : -1;
    }

    private void minHeapify() {

        int i = count - 1;
        while (i > 0 && heap[i] < heap[getParentIndex(i)]) {
            swap(i, getParentIndex(i));
            i = getParentIndex(i);
        }
    }

    private void swap(int left, int right) {

        int value = heap[left];
        heap[left] = heap[right];
        heap[right] = value;
    }

    private int getParentIndex(int i) {

        double parentIndex = (i - 1) / 2;
        return Double.valueOf(Math.floor(parentIndex)).intValue();
    }



}

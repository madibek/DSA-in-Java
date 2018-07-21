package malgara.kz.datastructures.heap;

public class Heap {


    // parent index = (index -1) / 2;
    // left child index = 2 * index + 1
    // right child index = 2 * index + 2

    private int [] heap = new int[10];
    private int count = 0;
    private HeapType type;

    public Heap(HeapType type) {
        this.type = type;
    }
    public void add(int value) {

        heap[count] = value;
        count++;
        if (type == HeapType.MinHeap) {
            minHeapify();
        } else {
            maxHeapify();
        }
    }

    private void maxHeapify() {


    }

    private void minHeapify() {

        int i = count -1;
        while (i > 0 && heap[i] < heap[parentIndex(i)]) {
            swapHeapItem(i, parentIndex(i));
            i = parentIndex(i);
        }
    }

    private void swapHeapItem(int left, int right) {
        int value = heap[left];
        heap[left] = heap[right];
        heap[right] = value;
    }

    private int parentIndex(int index) {
        double parentIndex = (index - 1) / 2;
        return Double.valueOf(Math.floor(parentIndex)).intValue();
    }

    public boolean contains(int value) {

        int i = 0;
        while (i < count && heap[i] != value) {
            i++;
        }

        return i < count ? true : false;
    }

    public boolean remove(int value) {
        return false;
    }

    public int size() {
        return count - 1;
    }

    public void traverse() {

        System.out.println("Heap items:");
        int i = 0;
        while (i < count) {
            System.out.println(heap[i]);
            i++;
        }
    }
}

enum HeapType {
    MinHeap,
    MaxHeap
}

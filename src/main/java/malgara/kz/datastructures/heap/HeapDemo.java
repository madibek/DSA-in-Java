package malgara.kz.datastructures.heap;

public class HeapDemo {

    public static void main(String[] args) {
        System.out.println(HeapDemo.class.getName());

        Heap heap = new Heap(HeapType.MinHeap);
        heap.add(17);
        heap.add(8);
        heap.add(4);

        int search = 8;
        if (heap.contains(search)) {
            System.out.println(search + " is found");
        }

        search = 30;
        if (!heap.contains(search)) {
            System.out.println(search + " is not found");
        }

        System.out.printf("Heap size: " + heap.size());
        System.out.println();
        heap.traverse();
    }
}

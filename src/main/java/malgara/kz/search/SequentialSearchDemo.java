package malgara.kz.search;

public class SequentialSearchDemo {

    public static void main(String[] args) {

        System.out.println(SequentialSearchDemo.class.getName());

        int item = 3;
        int[] arr = {1, 2, 3, 4, 5};
        int index = sequentialSearch(arr, item);

        if (index > 0) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
    }

    private static int sequentialSearch(int[] arr, int item) {

        int index = 0;
        while (index < arr.length && arr[index] != item) {
            index++;
        }

        return index < arr.length ? index : -1;
    }
}

package malgara.kz.search;

import java.util.Arrays;

public class ProbabilitySearchDemo {

    public static void main(String[] args) {

        System.out.println(ProbabilitySearchDemo.class.getName());

        int item = 5;
        int[] arr = {1, 2, 3, 4, 5};
        int index = probabilitySearch(arr, item);
        probabilitySearch(arr, item);
        probabilitySearch(arr, item);

        System.out.println(Arrays.toString(arr));
        if (index > 0) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
    }

    private static int probabilitySearch(int[] arr, int item) {

        int index = 0;
        while (index < arr.length && arr[index] != item) {
            index++;
        }

        if (index >= arr.length) {
            return -1;
        } else {

            if (index > 0) {
                swap(arr, index, index - 1);
            }
            return index;
        }
    }

    private static void swap(int[] arr, int left, int right) {

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

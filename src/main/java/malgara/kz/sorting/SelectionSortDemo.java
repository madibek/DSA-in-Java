package malgara.kz.sorting;

import java.util.Arrays;

public class SelectionSortDemo {

    public static void main(String[] args) {

        System.out.println(SelectionSortDemo.class.getName());

        int[] arrayToSort = {14, 18, 19, 37, 23, 40, 29, 30, 11, -1, 45, 67, 3, 5, 89, 5555, 44, 6, 2121};
        System.out.println("Array before sort: " + Arrays.toString(arrayToSort));

        int[] sortedArray = selectionSort(arrayToSort);
        System.out.println("Array after sort: " + Arrays.toString(sortedArray));
    }

    private static int[] selectionSort(int[] arrayToSort) {

        if (arrayToSort == null) {
            throw new RuntimeException("Array can not be null");
        }

        if (arrayToSort.length <= 1) {
            // already sorted array with one item
            return arrayToSort;
        }

        int min;
        for (int i = 0; i < arrayToSort.length; i++) {

            min = i;
            for (int j = i + 1; j < arrayToSort.length; j++) {

                if (arrayToSort[min] > arrayToSort[j]) {
                    min = j;
                }
            }

            swap(arrayToSort, i, min);
        }

        return arrayToSort;
    }

    private static void swap(int[] arrayToSort, int left, int right) {

        int temp = arrayToSort[left];
        arrayToSort[left] = arrayToSort[right];
        arrayToSort[right] = temp;
    }
}

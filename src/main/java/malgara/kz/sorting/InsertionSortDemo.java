package malgara.kz.sorting;

import java.util.Arrays;

public class InsertionSortDemo {

    public static void main(String[] args) {

        System.out.println(InsertionSortDemo.class.getName());

        int[] arrayToSort = {14, 18, 19, 37, 23, 40, 29, 30, 11, -1, 45, 67, 3, 5, 89, 5555, 44, 6, 2121};
        System.out.println("Array before sort: " + Arrays.toString(arrayToSort));

        int[] sortedArray = insertionSort2(arrayToSort);
        System.out.println("Array after sort: " + Arrays.toString(sortedArray));
    }

    private static int[] insertionSort(int[] arrayToSort) {

        if (arrayToSort == null) {
            throw new RuntimeException("Array can not be null");
        }

        if (arrayToSort.length <= 1) {
            // already sorted array with one item
            return arrayToSort;
        }

        int j;
        int key;
        int temp;

        for (int i = 1; i < arrayToSort.length; i++) {

//            key = arrayToSort[i];
//            j = i - 1;
//
//            while (j >= 0 && arrayToSort[j] > key) {
//                temp = arrayToSort[j + 1];
//                arrayToSort[j + 1] = arrayToSort[j];
//                arrayToSort[j] = temp;
//                j--;
//            }

            for (int k = i; k > 0; k--) {

                if (arrayToSort[k] < arrayToSort[k - 1]) {
                    temp = arrayToSort[k];
                    arrayToSort[k] = arrayToSort[k - 1];
                    arrayToSort[k - 1] = temp;
                } else {
                    break;
                }
            }
        }

        return arrayToSort;
    }

    private static int[] insertionSort2(int[] arr) {

        if (arr == null) {
            throw new RuntimeException("Array can not be null");
        }

        if (arr.length < 2) {
            // already sorted array with one item
            return arr;
        }

        int start = 1;
        while (start < arr.length) {

            int value = arr[start];
            int index = start - 1;
            while (index >= 0 && value < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }

            arr[index + 1] = value;
            start++;
        }

        return arr;

    }
}

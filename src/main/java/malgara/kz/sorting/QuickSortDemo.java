package malgara.kz.sorting;

import malgara.kz.datastructures.queues.Queue;

import java.util.Arrays;

public class QuickSortDemo {

    public static void main(String[] args) {

        System.out.println(QuickSortDemo.class.getName());

        int[] arrayToSort = {14, 18, 19, 37, 23, 40, 29, 30, 11, -1, 45, 67, 3, 5, 89, 5555, 44, 6, 2121};
        System.out.println("Array before sort: " + Arrays.toString(arrayToSort));

        int[] sortedArray = quickSort(arrayToSort);
        System.out.println("Array after sort: " + Arrays.toString(sortedArray));

    }

    private static int[] quickSort(int[] arrayToSort) {

        if (arrayToSort == null) {
            throw new RuntimeException("Array can not be null");
        }

        if (arrayToSort.length <= 1) {
            // already sorted array with one item
            return arrayToSort;
        }

        int pivot = getPivotValue(arrayToSort);

        Queue lessValues = new Queue();
        Queue equalValues = new Queue();
        Queue greaterValues = new Queue();

        for (int value : arrayToSort) {

            if (value < pivot) {
                lessValues.enqueue(value);
            } else if (value > pivot) {
                greaterValues.enqueue(value);
            } else {
                equalValues.enqueue(value);
            }

        }

        int count = 0;
        int[] lessArr = new int[lessValues.size()];
        while (lessValues.hasMore()) {
            lessArr[count] = lessValues.dequeue();
            count++;
        }

        count = 0;
        int[] equalArr = new int[equalValues.size()];
        while (equalValues.hasMore()) {
            equalArr[count] = equalValues.dequeue();
            count++;
        }

        count = 0;
        int[] greaterArr = new int[greaterValues.size()];
        while (greaterValues.hasMore()) {
            greaterArr[count] = greaterValues.dequeue();
            count++;
        }

        return concatenate(quickSort(lessArr), equalArr, quickSort(greaterArr));
    }

    private static int[] concatenate(int[] leftArray, int[] equalArray, int[] rightArray) {

        int[] result = new int[leftArray.length + equalArray.length + rightArray.length];

        int count = 0;

        for (int value : leftArray) {
            result[count++] = value;
        }

        for (int value : equalArray) {
            result[count++] = value;
        }

        for (int value : rightArray) {
            result[count++] = value;
        }

        return result;
    }

    private static int getPivotValue(int[] arrayToSort) {
        return arrayToSort[arrayToSort.length / 2];
    }
}

package malgara.kz.sorting;

import java.util.Arrays;

public class MergeSortDemo {

    public static void main(String[] args) {

        System.out.println(MergeSortDemo.class.getName());

        int[] arrayToSort = {14, 18, 19, 37, 23, 40, 29, 30, 11, -1, 45, 67, 3, 5, 89, 5555, 44, 6, 2121};
        System.out.println("Array before sort: " + Arrays.toString(arrayToSort));

        int [] sortedArray = mergeSort(arrayToSort);
        System.out.println("Array after sort: " + Arrays.toString(sortedArray));
    }

    private static int[] mergeSort(int[] arrayToSort) {

        if (arrayToSort == null) {
            throw new RuntimeException("Array can not be null");
        }

        if (arrayToSort.length <= 1) {
            // already sorted array with one item
            return arrayToSort;
        }

        int left = arrayToSort.length / 2;
        int right = arrayToSort.length - left;

        int[] leftArr = new int[left];
        int[] rightArr = new int[right];

        for (int i = 0; i < left; i++) {
            leftArr[i] = arrayToSort[i];
        }

        for (int i = 0; i < right; i++) {
            rightArr[i] = arrayToSort[left + i];
        }

        leftArr = mergeSort(leftArr);
        rightArr = mergeSort(rightArr);

        return merge(leftArr, rightArr, arrayToSort);
    }

    private static int[] merge(int[] leftArr, int[] rightArr, int[] result) {

        int count = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArr.length && rightIndex < rightArr.length) {

            if (leftArr[leftIndex] < rightArr[rightIndex]) {
                result[count] = leftArr[leftIndex];
                leftIndex++;
            } else {
                result[count] = rightArr[rightIndex];
                rightIndex++;
            }

            count++;
        }

        while (leftIndex < leftArr.length) {
            result[count] = leftArr[leftIndex];
            leftIndex++;
            count++;
        }

        while (rightIndex < rightArr.length) {
            result[count] = rightArr[rightIndex];
            rightIndex++;
            count++;
        }


        return result;
    }
}

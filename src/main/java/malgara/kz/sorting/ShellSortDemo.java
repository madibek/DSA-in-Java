package malgara.kz.sorting;

import java.util.Arrays;

public class ShellSortDemo {

    public static void main(String[] args) {

        System.out.println(ShellSortDemo.class.getName());

        int[] arrayToSort = {14, 18, 19, 37, 23, 40, 29, 30, 11, -1, 45, 67, 3, 5, 89, 5555, 44, 6, 2121};
        System.out.println("Array before sort: " + Arrays.toString(arrayToSort));

        int[] sortedArray = shellSort2(arrayToSort);
        System.out.println("Array after sort: " + Arrays.toString(sortedArray));
    }

    private static int[] shellSort(int[] arrayToSort) {

        if (arrayToSort == null) {
            throw new RuntimeException("Array can not be null");
        }

        if (arrayToSort.length <= 1) {
            // already sorted array with one item
            return arrayToSort;
        }

        int gap = arrayToSort.length / 2;

        while (gap > 0) {

            int curr = gap;
            while (curr < arrayToSort.length) {

                int value = arrayToSort[curr];
                int i = curr - gap;

                while (i >= 0 && value < arrayToSort[i]) {
                    arrayToSort[i + gap] = arrayToSort[i];
                    i = i - gap;
                }

                arrayToSort[i + gap] = value;
                curr = curr + 1;
            }

            gap /= 2;
        }

        return arrayToSort;
    }

    private static int[] shellSort2(int[] arr) {

        if (arr == null) {
            throw new RuntimeException("Array can not be null");
        }

        if (arr.length < 2) {
            // already sorted array with one item
            return arr;
        }

        int gap = arr.length / 2;
        while (gap > 0) {

            int start = gap;
            while (start < arr.length) {

                int value = arr[start];
                int index = start - gap;
                while (index >= 0 && value < arr[index]) {
                    arr[index + gap] = arr[index];
                    index = index - gap;
                }

                arr[index + gap] = value;
                start++;
            }

            gap = gap / 2;
        }

        return arr;

    }

    }

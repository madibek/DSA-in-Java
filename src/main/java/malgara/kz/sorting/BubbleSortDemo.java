package malgara.kz.sorting;

import java.util.Arrays;

public class BubbleSortDemo {

    public static void main(String[] args) {

        System.out.println(BubbleSortDemo.class.getName());

        int[] arrayToSort = {14, 18, 19, 37, 23, 40, 29, 30, 11};
        System.out.println("Array before sort: " + Arrays.toString(arrayToSort));

        int [] sortedArray = bubbleSort(arrayToSort);
        System.out.println("Array after sort: " + Arrays.toString(sortedArray));


    }

    private static int[] bubbleSort(int[] arrayToSort) {


        for (int i = 0; i < arrayToSort.length; i++) {

            for (int j = i + 1; j < arrayToSort.length; j++) {

                if (arrayToSort[i] > arrayToSort[j]) {
                    swap(arrayToSort, i, j);
                }
            }

        }

        return arrayToSort;
    }

    private static void swap(int[] arrayToSort, int left, int right) {

        int temp = arrayToSort[left];
        arrayToSort[left] = arrayToSort[right];
        arrayToSort[right] = temp;

    }
}

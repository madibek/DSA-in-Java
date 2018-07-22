package malgara.kz.sorting;

import java.util.Arrays;

public class ShellSortDemo {

    public static void main(String[] args) {

        System.out.println(ShellSortDemo.class.getName());

        int[] arrayToSort = {14, 18, 19, 37, 23, 40, 29, 30, 11, -1, 45, 67, 3, 5, 89, 5555, 44, 6, 2121};
        System.out.println("Array before sort: " + Arrays.toString(arrayToSort));

        int[] sortedArray = shellSort(arrayToSort);
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

            for (int i = 0; i < gap; i++) {

//                for (int j = i; j > 0 && arrayToSort[j] < arrayToSort[j - gap]; j-=gap) {
//                    int temp = arrayToSort[j];
//                    arrayToSort[j] = arrayToSort[j - gap];
//                    arrayToSort[j - gap] = temp;
//
//                }

                int value = arrayToSort[i];
                int inner = i;
                while (inner > i - 1 && arrayToSort[inner - i] > value) {
                    arrayToSort[inner] = arrayToSort[inner - i];
                    inner = inner - i;
                }
                arrayToSort[inner] = value;
            }
            gap /= 2;
        }

        return arrayToSort;
    }
}

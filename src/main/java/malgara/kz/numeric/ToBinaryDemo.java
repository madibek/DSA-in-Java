package malgara.kz.numeric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ToBinaryDemo {

    public static void main(String[] args) {

        System.out.println(ToBinaryDemo.class.getName());
        int number = 456;
        printNumberAsBinary(number);
    }

    private static void printNumberAsBinary(int number) {

        String binary = toBinary(number)
                .stream()
                .map(n-> n + "")
                .collect(Collectors.joining(""));
        System.out.println(number + " to binary: " + binary);
    }

    private static List<Integer> toBinary(int number) {

        if (number < 0) {
            throw new RuntimeException("Number can not be less than 0");
        }

        List<Integer> list = new ArrayList<>();
        while (number > 0) {


            /*if (number % 2 == 0) {
                list.add(0);
            } else {
                list.add(1);
            }*/
            list.add(number % 2);
            number = number / 2;
        }

        Collections.reverse(list);
        return list;
    }
}

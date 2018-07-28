package malgara.kz.numeric;

public class FactorialDemo {

    public static void main(String[] args) {

        System.out.println(FactorialDemo.class.getName());

        int number = 10;
        int fact = factorial(number);
        System.out.printf("Factorial of " + number + " is " + fact);
    }

    private static int factorial(int number) {

        if (number < 2) {
            return 1;
        }

        int fact = 1;

        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }
}

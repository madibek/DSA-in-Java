package malgara.kz.numeric;

public class FibonacciDemo {

    public static void main(String[] args) {

        System.out.println(FibonacciDemo.class.getName());

        int number = 7;
        int fib = fibonacci(number);
        System.out.println("Fibonacci of " + number + " is " + fib);
    }

    private static int fibonacci(int number) {

        if (number < 1) {
            return 0;
        }

        if (number > 0 && number < 3) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);

    }
}

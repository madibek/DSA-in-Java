package malgara.kz.numeric;

public class PrimalityTest {

    public static void main(String[] args) {

        System.out.println(PrimalityTest.class.getName());

        printIsPrimeNumber(1);
        printIsPrimeNumber(3);
        printIsPrimeNumber(7);
        printIsPrimeNumber(9);
        printIsPrimeNumber(20);
        printIsPrimeNumber(19);

    }

    private static void printIsPrimeNumber(int number) {

        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }

    }

    private static boolean isPrime(int number) {

        if (number > -1 && number < 2) {
            return true;
        }

//        int sqrt = (int) Math.sqrt(number);
//        for (int i = 2; i < number; i++) {
//
//            for (int j = 1; j <= sqrt; j++) {
//                if (j * i == number) {
//                    return false;
//                }
//
//            }
//        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

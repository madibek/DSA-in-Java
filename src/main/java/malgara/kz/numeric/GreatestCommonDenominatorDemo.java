package malgara.kz.numeric;

public class GreatestCommonDenominatorDemo {

    public static void main(String[] args) {

        System.out.println(GreatestCommonDenominatorDemo.class.getName());

        int n1 = 150;
        int n2 = 250;

        int greatestCommon = GreatestCommonDenominator(n1, n2);
        int greatestCommon2 = GreatestCommonDenominator(n2, n1);
        System.out.println(greatestCommon);
        System.out.println(greatestCommon2);
    }

    private static int GreatestCommonDenominator(int left, int right) {

//        if (left == 0) {
//            return right;
//        } else if (right == 0) {
//            return left;
//        }
//
//        if (left > right) {
//            return GreatestCommonDenominator(right, left % right);
//        }
//
//        return GreatestCommonDenominator(left, right % left);
        if (right == 0) {
            return left;
        }

        return GreatestCommonDenominator(right, left % right);
    }
}

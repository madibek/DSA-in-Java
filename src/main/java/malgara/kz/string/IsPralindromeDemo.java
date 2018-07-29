package malgara.kz.string;

public class IsPralindromeDemo {

    public static void main(String[] args) {

        System.out.println(IsPralindromeDemo.class.getName());

        String word = "qazaq";
        if (isPalindrom(word)) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + "is not palindrome");
        }
    }

    private static boolean isPalindrom(String word) {

        if (word == null || word.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = word.length() - 1;
        while (word.charAt(left) == word.charAt(right) && left < right) {
            left++;
            right--;
        }

        return word.charAt(left) == word.charAt(right);
    }
}

package problem4;

/*
Largest palindrome product

A palindromic number reads the same both ways. The largest palindrome 
made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    public static void main(String[] args) {
        int biggestPalindrome = 0;
        int num2 = 999;
        for (; num2 > num2 / 2; num2--) {
            for (int num1 = 100; num1 < num2; num1++) {
                int numToCheck = num1 * num2;
                if (isPalindrome(numToCheck)) {
                    if (biggestPalindrome < numToCheck) {
                        biggestPalindrome = numToCheck;
                    }
                }
            }
        }
        System.out.println(biggestPalindrome);
    }

    public static boolean isPalindrome(int number) {
        String stringRepOfNumber = Integer.toString(number);
        int low = 0;
        int high = stringRepOfNumber.length() - 1;

        boolean isPal = true;
        while (low < high) {
            if (stringRepOfNumber.charAt(low) != stringRepOfNumber.charAt(high)) {
                isPal = false;
                break;
            }
            low++;
            high--;
        }
        return isPal;
    }
}

package problem5;

/*
 * Smallet multiple
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */
public class Problem5 {

    public static void main(String[] args) {

        long numberToCheck = 21;
        final int UPPERLIMIT = 20;
        while (true) {
            boolean isEvenlyDivisible = true;
            for (int i = 1; i <= UPPERLIMIT; i++) {
                isEvenlyDivisible = true;
                if (numberToCheck % i != 0) {
                    isEvenlyDivisible = false;
                    break;
                }
            }
            if (isEvenlyDivisible) {
                System.out.println(numberToCheck);
                System.exit(0);
            }
            numberToCheck++;
        }
    }

}

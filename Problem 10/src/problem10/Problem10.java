package problem10;

/*
Summation of primes

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class Problem10 {

    public static void main(String[] args) {
        long sumOfPrimes = 0;
        final int UPPERLIMIT = 2_000_000;
        for (int i = 2; i <= UPPERLIMIT; i++) {
            if (isPrime(i)) {
                sumOfPrimes += i;
            }
        }
        System.out.println("Sum of primes: " + sumOfPrimes);

    }

    static boolean isPrime(int x) {
        int sqrt = (int) Math.sqrt(x) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

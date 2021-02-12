package problem7;

/*
10001st prime

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primeNumbers = new int[10_001];
        int count = 0;
        final int NUMBER_OF_PRIMES = primeNumbers.length;
        int number = 2;
        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
        System.out.println(primeNumbers[primeNumbers.length - 1]);
    }

}

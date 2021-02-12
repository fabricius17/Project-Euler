package problem3;

/*
Largest prime factor

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

    public static void main(String[] args) {
        long n = 600851475143L;
        {
            int p = 3;
            for (; n > 1; p += 2) {
                while (n % p == 0) {
                    n /= p;
                }
            }
            System.out.println(p - 2);
        }
        {
            n = 600851475143L;
            for (long i = 2; i < n; ++i) {
                while (n % i == 0) {
                    n = n / i;
                }
            }
            System.out.println(n);
        }
        {
            int factor = 2;
            int lastFactor = 1;
            while (n > 1) {
                if (n % factor == 0) {
                    lastFactor = factor;
                    n = n / factor;
                    while (n % factor == 0) {
                        n = n / factor;
                    }
                }
                factor = factor + 1;
            }
            System.out.println("lastFactor " + lastFactor);
        }
    }
}

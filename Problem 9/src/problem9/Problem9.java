package problem9;

/*
Special Pythagorean triplet

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
public class Problem9 {

    public static void main(String[] args) {
        final int SUM = 1000;
        int a = 0;
        int b = 0;
        int c = SUM - a - b;
        outerLoop:
        for (a = 1; a <= SUM / 3; a++) {
            for (b = a + 1; b <= SUM / 2; b++) {
                c = SUM - a - b;
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    System.out.printf("a=%d, b=%d, c=%d\n", a, b, c);
                    break outerLoop;
                }
            }
        }
        System.out.println("The product of a*b*c is " + a * b * c);
    }

}

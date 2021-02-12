package problem.pkg16;

import java.math.BigInteger;

/*
Power digit sum

215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
 */
public class Problem16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger num = new BigInteger("2");
        int exp = 1000;
        BigInteger numWithExp = num.pow(exp);
        String NWEString = numWithExp.toString();
//        BigInteger sum = new BigInteger("0");
        double sum = 0;
        for (double i = 0; i < NWEString.length(); i++) {
            sum += Double.parseDouble(Character.toString(NWEString.charAt((int) i)));
//            sum = sum.add(new BigInteger(Character.toString(NWEString.charAt((int) i))));
        }
        System.out.printf("Sum of digits for %d^%d is: %.1f\n", num.intValue(), exp, sum);
    }
}

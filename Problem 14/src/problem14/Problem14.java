package problem14;

import java.util.TreeMap;

/*
Longest Collatz sequence

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 {

    public static void main(String[] args) {
        long a;
        int j;
        int max = 0;
        int maxnr = 0;
        for (int i = 1; i < 1000000; i++) {
            a = i;
            j = 1;
            while (a != 1) {
                a = ((a & 1) == 1) ? (3 * a + 1) : (a >> 1);
                j++;
            }
            if (j > max) {
                max = j;
                maxnr = i;
            }
        }
        System.out.println(maxnr);
        
//        TreeMap<Long, Long> startAndChain = new TreeMap<>();
//        for (long i = 10_000; i > 1; i--) {
//            long counter = 1;
//            long startValue = i;
//            long currentValue = startValue;
//            while (currentValue > 1) {
//                if (i == 12) {
////                    System.out.println(currentValue);
//                }
//                if (isEven(currentValue)) {
//                    currentValue = currentValue / 2;
//                } else {
//                    currentValue = (currentValue * 3) + 1;
//                }
//                counter++;
//            }
//
//            startAndChain.put(counter, startValue);
////            startAndChain.put(startValue, counter);
//        }
//        // skal måske skrives om så den printer det keyen ud, ikke værdien... ellers brug gammel metode
//        System.out.println("key " + startAndChain.get(startAndChain.lastKey()));
//        System.out.println(startAndChain);
         
    }

    public static boolean isEven(long i) {
        return i % 2 == 0;
    }

}

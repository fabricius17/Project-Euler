package problem8;

/*
Largest product in a series

The four adjacent digits in the 1000-digit number that have the
greatest product are 9 × 9 × 8 × 9 = 5832.

Find the thirteen adjacent digits in the 1000-digit number 
that have the greatest product. What is the value of this product?
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String NUMBERS = "73167176531330624919225119674426574742355349194934"
                + "96983520312774506326239578318016984801869478851843"
                + "85861560789112949495459501737958331952853208805511"
                + "12540698747158523863050715693290963295227443043557"
                + "66896648950445244523161731856403098711121722383113"
                + "62229893423380308135336276614282806444486645238749"
                + "30358907296290491560440772390713810515859307960866"
                + "70172427121883998797908792274921901699720888093776"
                + "65727333001053367881220235421809751254540594752243"
                + "52584907711670556013604839586446706324415722155397"
                + "53697817977846174064955149290862569321978468622482"
                + "83972241375657056057490261407972968652414535100474"
                + "82166370484403199890008895243450658541227588666881"
                + "16427171479924442928230863465674813919123162824586"
                + "17866458359124566529476545682848912883142607690042"
                + "24219022671055626321111109370544217506941658960408"
                + "07198403850962455444362981230987879927244284909188"
                + "84580156166097919133875499200524063689912560717606"
                + "05886116467109405077541002256983155200055935729725"
                + "71636269561882670428252483600823257530420752963450";

        char[] numbersAsArray = NUMBERS.toCharArray();
        long greatestProduct = 0;
        long num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0,
                num7 = 0, num8 = 0, num9 = 0, num10 = 0, num11 = 0, num12 = 0, num13 = 0;
        for (int i = 0; i < numbersAsArray.length - 12; i++) {
            num1 = Character.getNumericValue(numbersAsArray[i]);
            num2 = Character.getNumericValue(numbersAsArray[i + 1]);
            num3 = Character.getNumericValue(numbersAsArray[i + 2]);
            num4 = Character.getNumericValue(numbersAsArray[i + 3]);
            num5 = Character.getNumericValue(numbersAsArray[i + 4]);
            num6 = Character.getNumericValue(numbersAsArray[i + 5]);
            num7 = Character.getNumericValue(numbersAsArray[i + 6]);
            num8 = Character.getNumericValue(numbersAsArray[i + 7]);
            num9 = Character.getNumericValue(numbersAsArray[i + 8]);
            num10 = Character.getNumericValue(numbersAsArray[i + 9]);
            num11 = Character.getNumericValue(numbersAsArray[i + 10]);
            num12 = Character.getNumericValue(numbersAsArray[i + 11]);
            num13 = Character.getNumericValue(numbersAsArray[i + 12]);

            long productOfAllNumbers = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8
                    * num9 * num10 * num11 * num12 * num13;
            if (productOfAllNumbers > greatestProduct) {
                greatestProduct = productOfAllNumbers;
            }
        }
        System.out.println(greatestProduct);
    }

}

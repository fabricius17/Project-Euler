package problem6;

/*
* Sum square difference
*
* The sum of the squares of the first ten natural numbers is, 
* 1^2 + 2^2 + ... + 10^2 = 385
* The square of the sum of the first ten natural numbers is,
* (1 + 2 + ... + 10)^2 = 55^2 = 3025
* Hence the difference between the sum of the squares of the first 
* ten natural numbers and the square of the sum is 3025 − 385 = 2640.
*
* Find the difference between the sum of the squares of the first
* one hundred natural numbers and the square of the sum.
 */
public class Problem6 {

    public static void main(String[] args) {
        int sumOfSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        System.out.println(sumOfSquares);
        int squareSum = 0;
        int sumOfNaturalNumbers = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfNaturalNumbers += i;
        }
        squareSum+=Math.pow(sumOfNaturalNumbers, 2);
        System.out.println(squareSum);
        System.out.println("\n\nSolution below");
        System.out.println(squareSum-sumOfSquares);
    }

}

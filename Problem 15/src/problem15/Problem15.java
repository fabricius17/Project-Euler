package problem15;

/*
Lattice paths

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.


How many such routes are there through a 20×20 grid?
 */
public class Problem15 {

    public static void main(String[] args) {
        double n = 40;
        double x = 20;
        double result = (factorial(n)) / (factorial(x) * factorial(n - x));
        System.out.printf("Number of lattice paths in a 20x20 grid: %.1f\n", result);

    }

    /**
     * Return the factorial for the specified number
     */
    private static double factorial(double n) {
        if (n == 0) { //base case
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

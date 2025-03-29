import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(Power(n, m));

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.0;
        System.out.println("Time taken: " + duration + " seconds");
    }
    /**
     * This method calculates the power of a number using recursion.
     * It follows the formula:
     * a^n = a * a^(n-1), with the base case a^0 = 1.
     *
     * Time complexity: O(n), where n is the exponent.
     * The recursive function calls itself n times, leading to linear time complexity.
     *
     * @param n The base number.
     * @param m The exponent.
     * @return The result of a raised to the power of n.
     */
    public static int Power(int n, int m) {

        if (m == 0) {
            return 1;
        }
        return n * Power(n, m - 1);
    }
}

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(GCD(n, m));

        double endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        System.out.println("Time taken: " + time + "seconds");

    }
    /**
     * This method calculates the Greatest Common Divisor (GCD) using recursion.
     * It follows the Euclidean algorithm:
     * GCD(a, b) = GCD(b, a % b), where GCD(a, 0) = a.
     *
     * Time complexity: O(log(min(a, b))), because with each recursive step,
     * the problem size reduces approximately by half.
     *
     * @param a First number.
     * @param b Second number.
     * @return The GCD of a and b.
     */
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}

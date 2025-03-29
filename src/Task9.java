import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(Binomial(n, k));

        double endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        System.out.println("Time taken: " + time + " seconds");
    }
    /**
     * This method calculates the binomial coefficient C(n, k) recursively.
     * It follows the formula:
     * C(n, k) = C(n-1, k-1) + C(n-1, k)
     * Base cases: C(n, 0) = C(n, n) = 1.
     *
     * Time complexity: O(2^n), where n is the input number.
     * Since the function makes two recursive calls for each input,
     * the time complexity grows exponentially.
     *
     * @param n The total number of elements.
     * @param k The number of selected elements.
     * @return The binomial coefficient C(n, k).
     */

    public static int Binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return Binomial(n-1, k - 1) + Binomial(n - 1, k);
    }
}

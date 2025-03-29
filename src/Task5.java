import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.0;
        System.out.println(Fibonacci(n));
        System.out.println("Time taken: " + duration + " seconds");
    }
    /**
     * This method calculates the Fibonacci number at position n using recursion.
     * The Fibonacci sequence is defined as:
     * F(1) = 1, F(2) = 1
     * F(n) = F(n-1) + F(n-2) for n > 2.
     *
     * Time complexity: O(2^n), where n is the input number.
     * The recursive approach results in an exponential time complexity due to repeated calculations.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The Fibonacci number at position n.
     */
    public static int Fibonacci(int n) {

        if (n <= 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}

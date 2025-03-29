import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Factorial(n));

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.0;
        System.out.println("Time taken: " + duration + " seconds");
    }
    /**
     * This method calculates the factorial of a given number using recursion.
     * The factorial of a number n (denoted as n!) is the product of all positive integers from 1 to n.
     * It follows the recursive formula: n! = n * (n-1)! with base cases of 0! = 1 and 1! = 1.
     *
     * Time complexity: O(n), where n is the input number.
     * The recursive function calls itself n times, leading to linear time complexity.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int Factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else{
            return n * Factorial(n-1);
        }
    }
}

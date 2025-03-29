import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(FindPrime(n)){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Composite number");
        }
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.0;
        System.out.println(duration);
    }
    /**
     * This method checks if a given number is prime.
     * A prime number is a number greater than 1 that has no divisors other than 1 and itself.
     * The method iterates from 2 to n-1 and checks if n is divisible by any number.
     *
     * Time complexity: O(n), where n is the input number.
     * The method checks all numbers from 2 to n-1 in the worst case.
     *
     * @param n The number to be checked for primality.
     * @return true if the number is prime, false if it is composite.
     */
    public static boolean FindPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

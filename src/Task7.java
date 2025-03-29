import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printReverse(n, sc);

        sc.close();
    }

    /**
     * This method prints the elements in reverse order using recursion.
     * It reads the elements one by one and prints them in reverse by delaying output.
     * Time complexity: O(n), where n is the number of elements.
     * The recursion depth is n, and each recursive call processes one element.
     *
     * @param n The number of elements remaining to be read.
     * @param sc The Scanner object to read input.
     */
    public static void printReverse(int n, Scanner sc) {
        if (n == 0) {
            return;
        }
        int num = sc.nextInt();
        printReverse(n - 1, sc);
        System.out.print(num + " ");
    }
}

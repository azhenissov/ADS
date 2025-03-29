import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(FindMin(arr));

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 100000000.0;
        System.out.println(duration);
    }

    /**
     * This method finds the minimum element in the given array.
     * It iterates through the array and keeps track of the smallest element found.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The method iterates through the array once, making the complexity linear.
     *
     * @param arr The input array containing integers.
     * @return The minimum integer in the array.
     */
    public static int FindMin(int[] arr) {
        int min = arr[0]; // Assume the first element is the smallest
        for (int i = 1; i < arr.length; i++) { // Iterate through the array
            if (arr[i] < min) { // If a smaller element is found, update min
                min = arr[i];
            }
        }
        return min; // Return the smallest element found
    }
}

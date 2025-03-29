import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(FindAVG(arr));

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.0;
        System.out.println(duration);
    }
    /**
     * This method calculates the average of the elements in the given array.
     * It iterates through the array to compute the sum and then divides by the array length.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The method iterates through the array once, making the complexity linear.
     *
     * @param arr The input array containing integers.
     * @return The average value of the array elements.
     */
    public static double FindAVG(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / (double) arr.length;
        return avg;
    }
}

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(isDigit(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000000.0;
        System.out.println("Time taken: " + duration + " seconds");
    }
    /**
     * This method checks if a given string consists only of digits.
     * It iterates through each character in the string and verifies if it is a digit.
     *
     * Time complexity: O(n), where n is the length of the string.
     * The method checks each character once, leading to linear time complexity.
     *
     * @param str The input string to be checked.
     * @return true if the string consists only of digits, false otherwise.
     */
    public static Boolean isDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

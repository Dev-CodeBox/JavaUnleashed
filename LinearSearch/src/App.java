import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialised Array
        int[] arr = new int[5];

        // Inserting Elements Into Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Printing Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Printing Next Line
        System.out.println();

        // Finding Target
        System.out.println(findTarget(arr, 5));

        // Finding Minimum
        System.out.println(findMin(arr));

        // Finding Maximum
        System.out.println(findMax(arr));
    }

    // Find Target
    public static int findTarget(int[] arr, int target) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print("At Index : " + i + " is Target -> ");
                return target;
            }
        }
        return ans;
    }

    // Find Minimum
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Find Maximum
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Static Array Start Here */

        // Intialised Array
        int[] arr = new int[5];

        // Inserting Element Into Array
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        // Printing Array
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr));

        /* Dynamic Array Starts Here */

        // Initialised ArrayList
        ArrayList<Integer> arrList = new ArrayList<Integer>(5);

        System.out.println("Enter the number of elements:");
        int arrListSize = scanner.nextInt();
        System.out.println("Enter " + arrListSize + " elements:");

        // Inserting Element Into ArrayList
        for (int i = 0; i < arrListSize; i++) {
            arrList.add(scanner.nextInt());
        }

        // Printing ArrayList
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }

        /* MultiDimensional Array */

        // Intialised 2D Array Statically
        int[][] arr2d = new int[3][5];

        // Inserting Element Into 2D Array
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < 5; j++) {
                arr2d[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        // Create a 2D ArrayList

        ArrayList<ArrayList<Integer>> arrList2d = new ArrayList<>();

        // Get the size of the 2D ArrayList
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        // Input elements into the 2D ArrayList
        System.out.println("Enter the elements row by row:");
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>(); // Create a new row
            for (int j = 0; j < cols; j++) {
                row.add(scanner.nextInt()); // Add elements to the row
            }
            arrList2d.add(row); // Add the row to the 2D ArrayList
        }

        // Print the 2D ArrayList
        System.out.println("The 2D ArrayList is:");
        for (int i = 0; i < arrList2d.size(); i++) {
            for (int j = 0; j < arrList2d.get(i).size(); j++) {
                System.out.print(arrList2d.get(i).get(j) + " "); // Access and print elements
            }
            System.out.println();
        }

    }
}

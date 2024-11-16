import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Printing Square
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        // Printing Rectangle
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n + 2; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        // Printing Inverted HalfPyramid
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        // Printing Triangle
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Printing Hollow Square
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || col == 0 || row == n - 1 || col == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Printing Rhombus
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print("  ");
            }
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Printing K
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < row + 2; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Printing Number Increasing Pyramid
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Printing Number Changing Pyramid
        int num = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();

        // Printing Zero-One Pyramid
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        // Executing code based on a condition
        if (age > 18) {
            System.out.println("Eligible To Vote");
        }

        if (age > 18) {
            System.out.println("Eligible To Vote");
        } else {
            System.out.println("Not Eligible To Vote");
        }

        if (age > 18) {
            System.out.println("Eligible To Vote");
        } else if (age > 15) {
            System.out.println("You Will Eligible Soon");
        } else {
            System.out.println("Not Eligible To Vote");
        }

        // Printing Numbers Till num Via Loop
        
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }

        int i = 0;
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
    }
}

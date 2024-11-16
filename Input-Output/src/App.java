import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Taking Input !
        Scanner scanner = new Scanner(System.in);
        int noOfApp = scanner.nextInt();
        int noOfWeb = scanner.nextInt();

        // Printing Output !
        System.out.println(noOfApp + noOfWeb);
        scanner.close();
    }
}

public class App {
    public static void main(String[] args) {
        greet();
        System.out.println("Sum Of Two Num = " + sum(5, 5));
        System.out.println(checkPrime(5));
        System.out.println(checkPos(10));
        vote(25);
        System.out.println(smallest(5, 10, 15));
        System.out.println(average(2, 17, 6));
        System.out.println(triangle(10, 20));
        System.out.println(circle(5));
        fibonacci(5);
    }

    // Greeting
    public static void greet() {
        System.out.println("Hello Java Developer");
    }

    // Sum Of Two Numbers
    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Checking Prime
    public static boolean checkPrime(int x) {
        if (x <= 1)
            return false;

        // Check divisibility from 2 to n-1
        for (int i = 2; i < x; i++)
            if (x % i == 0)
                return false;

        return true;
    }

    // Checking Positive Or Negative
    public static boolean checkPos(int x) {
        if (x > 0) {
            return true;
        }
        return false;
    }

    // Eligible To Vote
    public static void vote(int age) {
        if (age > 18) {
            System.out.println("Eligible To Vote");
        } else {
            System.out.println("Not-Eligible To Vote");
        }
    }

    // Smallest Number Among Three Numbers
    public static int smallest(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        }
        if (y < x && y < z) {
            return y;
        }
        return z;
    }

    // Average Of Three Numbers
    public static float average(int x, int y, int z) {
        float average = (x + y + z) / 3;
        return average;
    }

    // Area Of Triangle
    public static int triangle(int base, int height) {
        int area = (base * height) / 2;
        return area;
    }

    // Circumference Of Circle
    public static double circle(double radius) {
        double pie = 3.14;
        double circumference = 2 * pie * radius;
        return circumference;
    }

    // Fibonacci
    public static void fibonacci(int n) {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
}
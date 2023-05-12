package ss15_exception_debug_to_java.exercise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a:");
            int a = scanner.nextInt();
            System.out.print("Enter b:");
            int b = scanner.nextInt();
            System.out.print("Enter c:");
            int c = scanner.nextInt();
            if (a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException("Do not enter negative numbers!");
            }
            if (a + b < c || a + c < b || b + c < a) {
                throw new IllegalTriangleException("The sum of any two sides must be greater than the other!");
            }
            System.out.println("This is triangle!");
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}

package ss2_loop_to_java.exercise;

import java.util.Scanner;

public class ShowPrime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count;
        for (int i = 2; i <= number; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                if (i < 100) {
                    System.out.println(i);
                }
            }
        }
    }
}

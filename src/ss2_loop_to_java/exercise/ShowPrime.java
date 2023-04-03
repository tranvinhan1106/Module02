package ss2_loop_to_java.exercise;

import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng số nguyên tố đầu tiên cần tìm");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextByte();
        System.out.print(number + " số nguyên tố đầu tiên là: 2; ");
        int count = 1;
        int x = 3;
        while (count < number) {
            boolean test = false;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    test = true;
                    break;
                }
            }
            if (!test) {
                count += 1;
                System.out.print(x + "; ");
            }
            x += 1;
        }
    }
}

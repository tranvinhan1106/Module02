package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        int rate = 23000;
        System.out.println("Vui lòng nhập vào số USD muốn đổi :");
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        System.out.println("giá trị VND là :" + usd * rate);
    }
}

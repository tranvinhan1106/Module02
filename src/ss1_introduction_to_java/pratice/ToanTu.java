package ss1_introduction_to_java.pratice;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width ;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width :");
        width = scanner.nextFloat();
        System.out.println("Enter height :");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Diện tích chữ nhật là " + area);
    }
}

package ss3_array_method_to_java.exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[100];
        System.out.println("Nhập số phần tử của mảng");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println(" Nhập phần tử  " + i + ":");
            Array[i] = sc.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập là :");
        for (int i = 0; i < size; i++) {
            System.out.print(Array[i]);
        }
        System.out.println(" ");
        System.out.println("Nhập phần tử cần thêm vào mảng :");
        int add = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn : ");
        int location = sc.nextInt();
        for (int i = size - 1; i >= location; i--) {
            Array[i + 1] = Array[i];
        }
        Array[location] = add;
        size = size + 1;
        System.out.println("Mảng sau khi chèn là ");
        for (int i = 0; i < size; i++) {
            System.out.println(Array[i]);
        }
    }
}

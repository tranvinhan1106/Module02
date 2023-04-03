package ss3_array_method_to_java.exercise;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng :");
        int size = scanner.nextInt();
        int[] myArr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử " + i + ":");
            myArr[i] = scanner.nextInt();
        }
        System.out.println("Mảng của bạn là :");
        for (int value  : myArr){
            System.out.print(value + " ");
        }
        int min = myArr[0];
        for (int i = 1; i <myArr.length ; i++) {
            if (min > myArr[i]){
                min = myArr[i];
            }
        }
        System.out.println();
        System.out.println("Phần tử nhỏ nhất trong mảng là :"+ min);
    }
}

package ss3_array_method_to_java.exercise;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Mảng mặc định là :");
        for (int value : myArr) {
            System.out.print(value + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Nhập phần tử bạn muốn xóa :");
        int number = scanner.nextInt();
        for (int i = 0; i < myArr.length; ) {
            if (number == myArr[i]) {
                for (; number <= myArr.length - 1; number++) {
                    myArr[i] = myArr[i + 1];
                    i++;
                }
                myArr[myArr.length - 1] = 0;
                break;
            } else {
                i++;
            }
        }
        System.out.println("Mảng sau khi xóa là :");
        for (int value : myArr) {
            System.out.print(value + " ");
        }
    }
}

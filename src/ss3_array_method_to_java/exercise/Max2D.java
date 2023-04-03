package ss3_array_method_to_java.exercise;

import java.util.Scanner;

public class Max2D {
    public static String maxArr(double arr[][]) {
        double max = arr[0][0];
        int NumberLine = 0;
        int someColum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    NumberLine = i;
                    someColum = j;
                }
            }
        }
        return max + "\ttọa độ dòng :" + (NumberLine + 1) + "\tcột :" + (someColum + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng :");
        int lineNumber = sc.nextInt();
        System.out.println("Nhập vào số cột :");
        int someColumns = sc.nextInt();
        double number2D[][] = new double[lineNumber][someColumns];
        for (int i = 0; i < lineNumber; i++) {
            System.out.println("Dòng " + (i + 1));
            for (int j = 0; j < someColumns; j++) {
                System.out.println("Mời bạn nhập giá trị vào dòng , " + (i + 1) + " Tại cột " + (j + 1));
                number2D[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Max là :" + maxArr(number2D));
    }
}


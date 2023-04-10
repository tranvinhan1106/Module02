package ss3_array_method_to_java.exercise;

import java.util.Scanner;

public class SumOfMainDiagonal {
    public static int sumofMainDiagonal(int[][] arr) {
        int sumMainDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumMainDiagonal += arr[i][i];
        }
        return sumMainDiagonal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lines: ");
        int lineNumber = sc.nextInt();
        System.out.print("Enter columns: ");
        int someColumns = sc.nextInt();
        int[][] number2D = new int[lineNumber][someColumns];

        for (int i = 0; i < lineNumber; i++) {
            System.out.println("Line " + (i + 1));
            for (int j = 0; j < someColumns; j++) {
                System.out.println("Enter line: " + (i + 1) + "Att the index: " + (j + 1));
                number2D[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < number2D.length; i++) {
            for (int j = 0; j < number2D[i].length; j++) {
                System.out.print(number2D[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println(sumofMainDiagonal(number2D));
    }
}

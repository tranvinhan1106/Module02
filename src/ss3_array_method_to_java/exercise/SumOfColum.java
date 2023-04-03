package ss3_array_method_to_java.exercise;

import java.util.Scanner;

public class SumOfColum {
    static double myArr[][];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng : ");
        int rowlength = scanner.nextInt();
        System.out.print("Nhập số cột :");
        int collength = scanner.nextInt();
        myArr = new double[rowlength][collength];
        for (int i = 0; i < rowlength; i++) {
            for (int j = 0; j < collength; j++) {
                System.out.println("Nhập giá trị vào dòng " + i + " cột " + j + ":");
                myArr[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.print(myArr[i][j] + " \t ");
            }
            System.out.println(" ");
        }
        System.out.println("Nhập cột bạn muốn tính tổng :");
        int indexCol = scanner.nextInt();
        System.out.println("Tổng của cột :" + indexCol + " là :" + columSum(myArr, indexCol));
    }
    public static double columSum(double[][] myArr, int index) {
        double sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            sum += myArr[i][index];
        }
        return sum;
    }
}

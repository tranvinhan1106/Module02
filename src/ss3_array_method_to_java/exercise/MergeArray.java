package ss3_array_method_to_java.exercise;


import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int myArrFirst[];
        int myArrSecond[];
        int myArrMerge[];
        myArrFirst = new int[3];
        myArrSecond = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < myArrFirst.length; i++) {
            System.out.println("Nhập phần tử " + i + " vào myArrFirst :");
            myArrFirst[i] = scanner.nextInt();
        }
        System.out.println("Mảng đã đầu tiên là :");
        for (int value : myArrFirst) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int i = 0; i < myArrSecond.length; i++) {
            System.out.println("Nhập phần tử " + i + " vào myArrSecond :");
            myArrSecond[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Mảng đã thứ hai là :");
        for (int value : myArrSecond) {
            System.out.print(value + " ");
        }
        int lengthFirst = myArrFirst.length;
        int lengthSecond = myArrSecond.length;
        myArrMerge = new int[lengthFirst + lengthSecond];
        System.arraycopy(myArrFirst, 0, myArrMerge, 0, lengthFirst);
        System.arraycopy(myArrSecond, 0, myArrMerge, lengthFirst, lengthSecond);
        System.out.println();
        System.out.println("Mảng đã gộp là :");
        for (int value : myArrMerge) {
            System.out.print(value + " ");
        }
    }
}

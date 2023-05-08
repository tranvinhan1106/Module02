package ss14_sortalgorithm_to_java.exercise;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("");
        insertionSort(list);
    }//Nhập vào kích thước mảng và các phần tử của mảng

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {//đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                System.out.println("Tráo đổi " + list[pos] + " với " + list[pos - 1]);
                System.out.println("");
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
            }

            list[pos] = x;
        }
        System.out.println("");
        System.out.print("array after sorting is : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
    }
}

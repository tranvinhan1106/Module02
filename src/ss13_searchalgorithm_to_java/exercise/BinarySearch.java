package ss13_searchalgorithm_to_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int[] myArr ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập kích thước mảng :");
        int size = scanner.nextInt();
        myArr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử " + i +" : ");
            myArr[i] = scanner.nextInt();
        }
        Arrays.sort(myArr);
        System.out.println("Mảng sau khi sắp xếp là :");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + "\t");
        }
        System.out.println();
        System.out.println("Nhập phần tử bạn muốn tìm kiếm :");
        int value = scanner.nextInt();
        System.out.println("Phần tử ở vị trí :");
        System.out.println(binarSearch(myArr,0, myArr.length-1, value));

    }
    public static int binarSearch(int[] myArr , int left , int right , int value){
        while (left <= right){
            int middle = (left + right)/2;
            if (myArr[middle] == value){
                return middle;
            }else if (value > myArr[middle]){
                return binarSearch(myArr, middle + 1 , myArr.length,value);
            } else if (value<myArr[middle]) {
                return binarSearch(myArr,0,middle-1,value);
            }
        }
        return -1;
    }
}

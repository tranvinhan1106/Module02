package ss11_stack_queue_to_java.exercise;

import java.util.Scanner;
import java.util.Stack;

public class ReserveStack {
    static int arrInt[];
    static String[] arrStr;

    public static void main(String[] args) {
//        Stack<String> wStack = new Stack<>();
//        Scanner scanner = new Scanner(System.in);
//        String mWorld = scanner.nextLine();
//        char temp;
//        for (int i = 0; i < mWorld.length(); i++) {
//            temp = mWorld.charAt(i);
//            wStack.push(String.valueOf(temp));
//        }
//        mWorld = "";
//        while (!(wStack.empty())) {
//            mWorld += wStack.pop();
//        }
//        System.out.println(mWorld);
//        Đảo ngược chuỗi !
        Stack<Integer> iStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu :");
        int n = scanner.nextInt();
        arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu arrInt[" + i + "] = ");
            arrInt[i] = scanner.nextInt();
            iStack.push(arrInt[i]);
        }
        int i = 0;
        while (!iStack.empty()) {
            arrInt[i] = iStack.pop();
            i++;
        }
        System.out.print("arrInt : ");
        for (int j = 0; j < n; j++) {
            System.out.print(arrInt[j] + "\t");
        }
        // Đảo ngược phần tử trong mảng số nguyên sử dụng Stack !
    }
}

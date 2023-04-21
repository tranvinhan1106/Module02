package ss11_stack_queue_to_java.exercise;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    static boolean result = true;

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi của bạn :");
        String str = scanner.nextLine();
        String[] temp = str.split("");
        for (int i = 0; i < str.length(); i++) {
            stack.push(temp[i]);
            queue.add(temp[i]);
        }

        while (!stack.empty()) {
            if (stack.pop().equals(queue.poll())) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Đó ko phải là chuỗi Panlindrome !");
        } else {
            System.out.println("Đó là chuỗi Panlindrome !");
        }
    }
}

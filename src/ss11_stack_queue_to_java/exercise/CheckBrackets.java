package ss11_stack_queue_to_java.exercise;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức bạn muốn kiểm tra :");
        String myStr = scanner.nextLine();
        if (Check(myStr)) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }

    public static boolean Check(String myStr) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < myStr.length(); i++) {
            char sym = myStr.charAt(i);

            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.empty()) {
                    return false;
                }
                Object left = bStack.pop();
                if (bStack.equals(left)) {
                    return false;

                }
            }
        }
        return bStack.isEmpty();
    }
}

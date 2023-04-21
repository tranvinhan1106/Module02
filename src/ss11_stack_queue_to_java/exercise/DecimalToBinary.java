package ss11_stack_queue_to_java.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number Decimal :");
        int numberD = scanner.nextInt();
        System.out.print("Binary system of " + numberD + " is :");
        while (numberD > 0) {
            myStack.push(numberD % 2);
            numberD /= 2;
        }
        while (!myStack.empty()) {
            System.out.print(myStack.pop());
        }

    }
}

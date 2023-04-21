package ss11_stack_queue_to_java.pratice;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack <T>{
    private LinkedList <T> stack ;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public void push(T element ){
        stack.addFirst(element);
    }
    public T pop(){
        if (stack.isEmpty()){
            throw  new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyGenericStack <String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    private int size() {
        return stack.size();
    }
}

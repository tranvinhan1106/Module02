package ss3_array_method_to_java.exercise;


import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        String character = "tranvinhan";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kí tự bạn muốn đếm trong chuỗi " + character + " : ");
        char input = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < character.length(); i++) {
            if (input == character.charAt(i)) {
                count++;
            }
        }
        System.out.println("Kí tự " + input + " xuất hiện " + count + " lần trong chuỗi");
    }
}

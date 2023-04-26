package ss12_jcf_to_java.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi bạn muốn đếm :");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        Map<String , Integer> wMap = new TreeMap<>();
        String[] arr = str.split(" ");
        int count ;
        String word;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            word = arr[i];
            if (wMap.containsKey(word)){
                wMap.put(word,count + 1);
            }else {
                wMap.put(word,count);
            }
        }
        for (String key : wMap.keySet()){
            System.out.println(key +" : " + wMap.get(key) + " times" );
        }
    }
}

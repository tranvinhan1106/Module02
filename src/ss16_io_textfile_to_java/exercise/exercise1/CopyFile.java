package ss16_io_textfile_to_java.exercise.exercise1;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
       try {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhập file nguồn :");
           File sourceFile = new File(scanner.nextLine());
           System.out.println("Nhập file đích :");
           File destFile = new File(scanner.nextLine());
           if (!sourceFile.exists()&&!destFile.exists()){
               throw new FileNotFoundException();
           }
           BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
           BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));
           String line ;
           while ((line = reader.readLine()) != null){
               writer.write(line);
               writer.newLine();
           }
           reader.close();
           writer.close();
           System.out.println("Ghi file thành công !");
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}

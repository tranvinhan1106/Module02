package ss16_io_textfile_to_java.pratice;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileText {
    public void ReadFileText( String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0 ;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng " + sum);
        }catch (Exception e){
            System.err.println("File ko tồn tại hoặc nội dung có lỗi !");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhâập đường dẫn file :");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileText readFileText = new ReadFileText();
        readFileText.ReadFileText(path);
    }

}

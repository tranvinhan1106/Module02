package ss16_io_textfile_to_java.pratice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile (String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine())!= null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.err.println("File ko tồn tại hoặc có lỗi ");
        }
        return numbers;
    }
    public void writeFile(String filePath , int max){
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter br = new BufferedWriter(writer);
            br.write("Giá trị lớn nhất là :"+ max);
            br.close();
        }catch (IOException e){
            e.printStackTrace();;
        }
        System.out.println("Ghi file thành công !");
    }
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\V.An\\Module02\\A1222I1\\src\\ss16_io_textfile_to_java\\pratice\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\V.An\\Module02\\A1222I1\\src\\ss16_io_textfile_to_java\\pratice\\result.txt",maxValue);
    }
}

package ss16_io_textfile_to_java.exercise.exercise2;

import ss16_io_textfile_to_java.exercise.exercise2.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILE_PATH ="D:\\V.An\\Module02\\A1222I1\\src\\ss16_io_textfile_to_java\\exercise\\country.csv";
    public static List<Country> readFileCsv(){
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader br = new BufferedReader(fileReader);
            List<Country> countryList = new ArrayList<>();
            String line ;
            String[] temp ;
            while ((line = br.readLine())!= null){
                temp = line.split(",");
                String id = temp[0];
                String code = temp[1];
                String name = temp[2];
                Country country = new Country(id,code,name);
                countryList.add(country);
            }
            br.close();
            return countryList;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
       List<Country> list = readFileCsv();
       for (Country country : list){
           System.out.println(country);
       }
    }
}

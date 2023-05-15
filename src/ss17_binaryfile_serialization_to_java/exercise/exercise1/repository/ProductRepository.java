package ss17_binaryfile_serialization_to_java.exercise.exercise1.repository;

import ss17_binaryfile_serialization_to_java.exercise.exercise1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Serializable {
    static String FILE_PATH = "D:\\V.An\\Module02\\A1222I1\\src\\ss17_binaryfile_serialization_to_java\\exercise\\repository\\fileProduct.txt";

    private void writeProduct(String FILE_PATH , List<Product> products){
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(products);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private List<Product> readProduct (String FILE_PATH) {
        List<Product> products = new ArrayList<>();
        try {
            File file = new File(FILE_PATH);
            if (!((file.length()) == 0)) {
                FileInputStream fis = new FileInputStream(FILE_PATH);
                ObjectInputStream ibs = new ObjectInputStream(fis);
                products = (List<Product>) ibs.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
        return products;
    }
    public void addProduct (Product product){
        List<Product> products;
        products = readProduct(FILE_PATH);
        products.add(product);
        writeProduct(FILE_PATH ,products);
    }
    public void displayProduct (){
        System.out.println(readProduct(FILE_PATH));
    }
    public void searchProduct(int codeProduct){
        List<Product> products =readProduct(FILE_PATH);
        for (Product product : products){
            if (product.getCodeProduct()==codeProduct){
                System.out.println(product);
            }else {
                System.err.println("Ko có mã sản phẩm này !");
            }
        }

    }
}

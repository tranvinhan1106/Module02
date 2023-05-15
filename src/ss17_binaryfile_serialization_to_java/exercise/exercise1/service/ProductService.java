package ss17_binaryfile_serialization_to_java.exercise.exercise1.service;

import ss17_binaryfile_serialization_to_java.exercise.exercise1.model.Product;
import ss17_binaryfile_serialization_to_java.exercise.exercise1.repository.ProductRepository;


import java.io.Serializable;
import java.util.Scanner;

public class ProductService implements Serializable {
    ProductRepository productRepository = new ProductRepository();
    public void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm :");
        int codeProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm :");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất :");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm :");
        double price = Integer.parseInt(scanner.nextLine());
        Product product1 = new Product(codeProduct,nameProduct,manufacturer,price);
        productRepository.addProduct(product1);
    }
    public void displayProduct(){
        productRepository.displayProduct();
    }
    public void searchProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm bạn tìm kiếm :");
        int codeProduct = scanner.nextInt();
        productRepository.searchProduct(codeProduct);
    }
}

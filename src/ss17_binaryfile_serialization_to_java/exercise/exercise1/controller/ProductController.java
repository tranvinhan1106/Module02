package ss17_binaryfile_serialization_to_java.exercise.exercise1.controller;

import ss17_binaryfile_serialization_to_java.exercise.exercise1.service.ProductService;

import java.io.Serializable;
import java.util.Scanner;

public class ProductController implements Serializable {
    ProductService productService = new ProductService();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        try {
            do {
                System.out.println("=====Thông tin sản phẩn ===== "+"\n"+
                        "1.Thêm sản phẩn"+"\n"+
                        "2.Hiển thị danh sách sản phẩm"+"\n"+
                        "3.Tìm kiếm thông tin sn phẩm"+"\n"+
                        "4.Thoát"+"\n"+
                        "Vui lòng nhập lựa chọn của bạn ( 1 -> 4 )");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        productService.addProduct();
                        break;
                    case 2:
                        productService.displayProduct();
                        break;
                    case 3:
                        productService.searchProduct();
                        break;
                    case 4:
                        check= false;
                }

            }while (check);

        }catch (Exception e){
            e.getMessage();
        }
    }
}



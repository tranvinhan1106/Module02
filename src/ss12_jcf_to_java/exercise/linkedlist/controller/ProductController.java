package ss12_jcf_to_java.exercise.linkedlist.controller;

import ss12_jcf_to_java.exercise.arraylist.model.Product;
import ss12_jcf_to_java.exercise.linkedlist.service.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static ProductServiceImpl service = new ProductServiceImpl();

    public static void displayMenu() {
        do {
            System.out.println("==========Menu==========");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Sửa thông tin sản phẩm theo id ");
            System.out.println("3. Xóa sản phẩm theo id ");
            System.out.println("4. Hiển thị danh sách sản phẩm ");
            System.out.println("5. Tìm kiếm sản phẩm theo tên ");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá ");
            System.out.println("7. Thoát ");
            System.out.println("Vui lòng nhập số !");
            Scanner scanner = new Scanner(System.in);
            int numberChoice = scanner.nextInt();
            switch (numberChoice) {
                case 1:
                    int id = service.nextId();
                    System.out.println("Nhập tên sản phẩm  :");
                    String name = scanner.next();
                    System.out.println("Nhập giá sản phẩm :");
                    int price = scanner.nextInt();
                    service.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.println("Nhập id bạn muốn sửa :");
                    id = scanner.nextInt();
                    System.out.println("Nhập tên sản phẩm mới :");
                    name = scanner.next();
                    System.out.println("Nhập giá sản phẩm mới :");
                    price = scanner.nextInt();
                    service.setProduct(id, name, price);
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm bạn muốn xóa :");
                    id = scanner.nextInt();
                    service.removeProduct(id);
                    break;
                case 4:
                    List<Product> productList = service.findAll();
                    for (Product product : productList) {
                        System.out.println(product);
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên bạn muốn tìm kiếm :");
                    name = scanner.next();
                    service.findProductName(name);
                    break;
                case 6:
                    System.out.println("1.Sắp xếp sản phẩm tăng dần !");
                    System.out.println("2.Sắp xếp sản phẩm giảm dần !");
                    int choice = Integer.parseInt(scanner.next());
                    switch (choice) {
                        case 1:
                            service.sortAscending();
                            break;
                        case 2:
                            service.sortDescending();
                            break;

                    }
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }

    public static void main(String[] args) {
        displayMenu();
    }
}

package ss17_binaryfile_serialization_to_java.exercise.view;


import ss17_binaryfile_serialization_to_java.exercise.controller.ProductController;

import java.io.Serializable;


public class Main implements Serializable {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayMenu();
    }
}

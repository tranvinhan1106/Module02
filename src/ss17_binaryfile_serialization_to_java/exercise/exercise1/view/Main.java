package ss17_binaryfile_serialization_to_java.exercise.exercise1.view;


import ss17_binaryfile_serialization_to_java.exercise.exercise1.controller.ProductController;

import java.io.Serializable;


public class Main implements Serializable {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayMenu();
    }
}

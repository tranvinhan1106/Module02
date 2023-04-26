package ss12_jcf_to_java.exercise.arraylist.service;

import ss12_jcf_to_java.exercise.arraylist.model.Product;

import java.util.List;

public interface IProductService {
    int nextId();

    void addProduct(Product product);

    void setProduct(int id, String name, int price);

    Product removeProduct(int id);

    List<Product> findAll();

    void findProductName(String name);

    void sortAscending();

    void sortDescending();
}

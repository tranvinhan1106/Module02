package ss12_jcf_to_java.exercise.arraylist.service;

import ss12_jcf_to_java.exercise.arraylist.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    private static List<Product> productList;

    private static int nextId = 1;

    static {
        productList = new ArrayList<>();
        productList.add(new Product(nextId++, "Điện thoại", 7000000));
        productList.add(new Product(nextId++, "Laptop", 20000000));
        productList.add(new Product(nextId++, "Ipad", 14000000));
    }

    @Override
    public int nextId() {
        return nextId++;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void setProduct(int id, String name, int price) {
        for (Product product : productList) {
            if (id == product.getId()) {
                product.setName(name);
                product.setPrice(price);
            }
        }
    }

    @Override
    public Product removeProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.remove(i);
            }
        }
        throw new IllegalArgumentException("Invalid product ID");
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }

    @Override
    public void findProductName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equalsIgnoreCase(name.trim())) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void sortAscending() {
        Collections.sort(productList, Comparator.comparing(Product::getPrice));

    }

    @Override
    public void sortDescending() {
        Comparator<Product> comparator = Comparator.comparing(Product::getPrice);
        Collections.sort(productList, comparator.reversed());
    }
}

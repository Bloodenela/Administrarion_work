package org.example.services;

import org.example.entities.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product project);

    List<Product> getAllProduct();

    Product getProductById(Long id);

    void deleteProductById(Long id);
}

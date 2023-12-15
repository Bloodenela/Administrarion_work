package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.entities.Product;
import org.example.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImplementations implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}

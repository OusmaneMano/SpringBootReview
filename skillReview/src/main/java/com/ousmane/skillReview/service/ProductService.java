package com.ousmane.skillReview.service;

import com.ousmane.skillReview.entity.Product;

import java.util.List;

public interface ProductService {
    Product create (Product product);
    List<Product> getAll();
    Product getById(Long id);
    Product update(Long id, Product product);
    List<Product> getByTitle(String keyword);
    List<Product> getByCategory(String category);
    List<Product> getByPublished(boolean published);
    void delete(Long id);
}

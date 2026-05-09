package com.ousmane.skillReview.service;

import com.ousmane.skillReview.entity.Product;
import com.ousmane.skillReview.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    public Product create (Product product){
        return repository.save(product);
    }

    @Override
    public List<Product> getAll(){
        return repository.findAll();
    }
    public Product getById(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Not Found" +id));
    }
    public Product update(Long id, Product product){
        Product existing = getById(id);
        existing.setTitle(product.getTitle());
        existing.setCategory(product.getCategory());
        existing.setPrice(product.getPrice());
        existing.setPublished(product.isPublished());
        return repository.save(existing);

    }
    public List<Product> getByTitle(String keyword){
        return repository.findByTitleContaining(keyword);

    }
    public List<Product> getByCategory(String category){
        return repository.findByCategory(category);
    }
    public void delete(Long id){
        repository.deleteById(id);

    }
    public List<Product> getByPublished(boolean published){
        return repository.findByPublished(published);
    }

}

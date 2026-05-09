package com.ousmane.skillReview.controller;

import com.ousmane.skillReview.entity.Product;
import com.ousmane.skillReview.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products")

public class ProductController {

    @Autowired
    public ProductService service;

    @PostMapping
    public ResponseEntity <Product> create( Product product){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.create(product));

    }
    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(service.getAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id,
                                          @RequestBody Product product){
        return ResponseEntity.ok(service.update(id, product));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/search")
    public ResponseEntity<List<Product>> search(@RequestParam String keyword){
        return ResponseEntity.ok(service.getByTitle(keyword));
    }
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Product>> searchByCategory(@PathVariable String category){
        return ResponseEntity.ok(service.getByCategory(category));
    }
    @GetMapping("/published")
    public ResponseEntity<List<Product>> SearchByPublished(boolean published){
        return ResponseEntity.ok(service.getByPublished(published));
    }

}



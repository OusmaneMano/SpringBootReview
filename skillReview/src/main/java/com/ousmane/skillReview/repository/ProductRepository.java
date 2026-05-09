package com.ousmane.skillReview.repository;


import com.ousmane.skillReview.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByTitleContaining (String keyword);
    List<Product> findByCategory (String category);
    List<Product> findByPublished(boolean published);

}

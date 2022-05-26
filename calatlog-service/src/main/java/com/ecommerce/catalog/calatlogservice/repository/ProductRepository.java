package com.ecommerce.catalog.calatlogservice.repository;

import com.ecommerce.catalog.calatlogservice.entity.Category;
import com.ecommerce.catalog.calatlogservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByProductId(Long productId);
}

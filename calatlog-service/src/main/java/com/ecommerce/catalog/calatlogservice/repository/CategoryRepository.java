package com.ecommerce.catalog.calatlogservice.repository;

import com.ecommerce.catalog.calatlogservice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByCategoryId(Long categoryId);
}

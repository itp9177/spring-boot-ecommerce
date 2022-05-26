package com.ecommerce.catalog.calatlogservice.services;

import com.ecommerce.catalog.calatlogservice.entity.Category;
import com.ecommerce.catalog.calatlogservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public Category create(Category category){
        if(Auth.has("ROLE_ADMIN")){
            return categoryRepository.save(category);
        }
        return new Category();
    }
}

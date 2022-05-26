package com.ecommerce.catalog.calatlogservice.controller;

import com.ecommerce.catalog.calatlogservice.VO.Authuser;
import com.ecommerce.catalog.calatlogservice.entity.Category;
import com.ecommerce.catalog.calatlogservice.entity.Product;
import com.ecommerce.catalog.calatlogservice.repository.CategoryRepository;
import com.ecommerce.catalog.calatlogservice.services.Auth;
import com.ecommerce.catalog.calatlogservice.services.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.catalog.Catalog;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/catalog")
@Slf4j
public class CatalogController {

    @Autowired
    private Auth auth;
    @Autowired
    private CategoryRepository categoryRepository;
@Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public List<Category> getCatalog(){
return categoryRepository.findAll();
    }
    @PostMapping("/add/category")
    public Category add(@RequestBody Category category){
       // return categoryRepository.save(category);
      return categoryService.create(category);
        }
@PostMapping("add/category/product")
    public Product add(@RequestBody Product product){

}
}

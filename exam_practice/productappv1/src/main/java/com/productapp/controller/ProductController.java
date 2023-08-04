package com.productapp.controller;

import com.productapp.entity.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("products/{id}")
    public Product getById( @PathVariable(name = "id") int id){
        System.out.println("-----------------");
        return productService.getById(id);
    }
}

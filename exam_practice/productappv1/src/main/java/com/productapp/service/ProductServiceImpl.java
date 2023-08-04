package com.productapp.service;

import com.productapp.entity.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product getById(int id) {
        return productRepo.findById(id).orElseThrow(() -> new ProductNotFoundException("product with id "+id +"is not found"));
    }
}

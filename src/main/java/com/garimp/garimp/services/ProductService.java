package com.garimp.garimp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garimp.garimp.entities.Product;
import com.garimp.garimp.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired 
    private ProductRepository repository;

    public List <Product> findAllProducts(){
        return this.repository.findAll();
    }
    public Product  saveProduct(Product product){
        return this.repository.save(product);
    } 

}

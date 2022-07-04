package com.garimp.garimp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garimp.garimp.entities.Product;
import com.garimp.garimp.entities.User;
import com.garimp.garimp.services.ProductService;
import com.garimp.garimp.services.UserService;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    @Autowired 
    ProductService service ;
    
    @GetMapping  
    public List<Product> listProducts() {


        return service.findAllProducts();

    }
    
    @PostMapping
    public Product product (@RequestBody Product product){

        return service.saveProduct(product);

    }
}


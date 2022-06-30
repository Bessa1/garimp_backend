package com.garimp.garimp.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.garimp.garimp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}

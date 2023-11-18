package com.sanjay.productservices.Repository;

import com.sanjay.productservices.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    // You can add custom query methods here if needed
}

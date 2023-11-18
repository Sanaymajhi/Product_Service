package com.sanjay.productservices.Service;

import com.sanjay.productservices.Entity.Product;
import com.sanjay.productservices.Mapper.ProductMapper;
import com.sanjay.productservices.OrderDto.ProductRequest;
import com.sanjay.productservices.OrderDto.ProductResponse;
import com.sanjay.productservices.Repository.ProductRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductRequest createProduct(ProductRequest productRequest) {
        // Map productrequest DTO to product entity
        Product product = ProductMapper.mapToProduct(productRequest);

        Product savedProduct = productRepository.save(product);

       // log.info("Product {} is saved", savedProduct.getId());

        return ProductMapper.mapToProductRequest(savedProduct);
    }

    //return the when call getmapping


    //map to product and return productResponse dto


}

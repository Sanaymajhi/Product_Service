package com.sanjay.productservices.Mapper;

import com.sanjay.productservices.Entity.Product;
import com.sanjay.productservices.OrderDto.ProductRequest;

public class ProductMapper {
    //map to entity to dto ,return dto
    public static ProductRequest mapToProductRequest(Product product){
        return new ProductRequest(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }

    //map to dto to entity and return entity
    public static Product mapToProduct(ProductRequest productRequest){
        return new Product(
                productRequest.getId(),
                productRequest.getName(),
                productRequest.getDescription(),
                productRequest.getPrice()
        );
    }
}

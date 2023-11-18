package com.sanjay.productservices.Controller;

import com.sanjay.productservices.OrderDto.ProductRequest;
import com.sanjay.productservices.OrderDto.ProductResponse;
import com.sanjay.productservices.Service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ap/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductRequest> createProduct(@RequestBody ProductRequest productRequest){
         ProductRequest saved = productService.createProduct(productRequest);
         return new ResponseEntity<>(saved,HttpStatus.CREATED);

    }


}

package com.sanjay.productservices.OrderDto;

import java.math.BigDecimal;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductRequest {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;


}

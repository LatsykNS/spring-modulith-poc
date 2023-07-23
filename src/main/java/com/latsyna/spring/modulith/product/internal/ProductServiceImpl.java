package com.latsyna.spring.modulith.product.internal;

import java.util.List;
import com.latsyna.spring.modulith.product.Product;
import com.latsyna.spring.modulith.product.ProductService;
import org.springframework.stereotype.Component;

/**
 * The product service implementation.
 */
@Component
public class ProductServiceImpl implements ProductService {

  @Override
  public List<Product> getAllProducts() {
    return List.of(new Product("1", "Product 1", "Description 1", "1.00"),
        new Product("2", "Product 2", "Description 2", "2.00"),
        new Product("3", "Product 3", "Description 3", "3.00"));
  }
}

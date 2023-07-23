package com.latsyna.spring.modulith.api;

import com.latsyna.spring.modulith.product.Product;
import com.latsyna.spring.modulith.product.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * Product API.
 */
@RequestMapping("/api/products")
@RestController
public class ProductApi {

  private final Logger LOG = Logger.getLogger(ProductApi.class.getName());

  private final ProductService productService;

  ProductApi(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  public List<Product> getAllProducts() {
    var products = productService.getAllProducts();
    LOG.info("Found " + products.size() + " products.");
    return products;
  }

}

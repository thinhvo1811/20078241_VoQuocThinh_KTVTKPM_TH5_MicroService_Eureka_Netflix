package vn.edu.iuh.fit.product_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.product_service.models.Product;


@RestController
public class ProductController {
    @GetMapping("/product")
    public Product getProduct(){
        Product product = new Product(1L, "Áo khoác nam", 100000);
        return product;
    }
}

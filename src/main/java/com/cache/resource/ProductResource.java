package com.cache.resource;

import com.cache.entity.Product;
import com.cache.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
@Slf4j
public class ProductResource {

    private final ProductService productService;


    @GetMapping
    public List<Product> listAll(){
        log.info("n=ProductResource, m=listAll");
        return productService.listAll();
    }
}

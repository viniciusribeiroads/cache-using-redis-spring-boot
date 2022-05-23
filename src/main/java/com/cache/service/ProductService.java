package com.cache.service;

import com.cache.entity.Product;
import com.cache.repository.ProductsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductService {

    private final ProductsRepository productsRepository;

    @Cacheable("product-cache")
    public List<Product> listAll(){
        log.info("n=ProductService, m=listAll");
        return productsRepository.listAll();
    }
}

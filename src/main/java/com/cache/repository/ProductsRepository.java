package com.cache.repository;

import com.cache.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Component
@Slf4j
public class ProductsRepository {

    public List<Product> listAll(){
        log.info("n=ProductsRepository, m=listAll");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Acessa banco de dados e retorna a lista
        final Product product1 = new Product("123", new BigDecimal("10.00"), "Produto 1");
        final Product product2 = Product.builder()
                .sku("987")
                .price(new BigDecimal("50.00"))
                .description("Product 2")
                .build();

        List<Product> products = List.of(product1, product2);
        return products;
    }
}

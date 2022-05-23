package com.cache.repository;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caches")
public class CacheResource {



    @GetMapping
    @CacheEvict(value = "product-cache", key = "")
    public String clearCache(){
        return "Cache clean";
    }
}

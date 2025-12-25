package org.s2p.controller;

import lombok.RequiredArgsConstructor;
import org.s2p.entity.Product;
import org.s2p.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController
{
    private final ProductRepository productRepository;

    @GetMapping
    public List<Product> getProducts()
    {
        List<Product> productList =  productRepository.findAll();
        return productList;
    }
}

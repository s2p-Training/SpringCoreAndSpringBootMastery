package org.s2p.controller;

import lombok.RequiredArgsConstructor;
import org.s2p.dto.ProductDto;
import org.s2p.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController
{
    private final ProductService productService;


    // http://localhost:8080/api/v1/products
    @GetMapping
    public List<ProductDto> getProducts()
    {
        List<ProductDto> products =  productService.fetchAllProducts();
        return products;
    }

}

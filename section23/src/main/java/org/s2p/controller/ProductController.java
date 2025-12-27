package org.s2p.controller;

import lombok.RequiredArgsConstructor;
import org.s2p.dto.ProductDto;
import org.s2p.service.IProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController
{
    private final IProductService productService;

//    @CrossOrigin(origins = {"http://localhost:5173"})
    @GetMapping
    public List<ProductDto> getProducts()
    {
        System.out.println("Hello Products API");
        List<ProductDto> productDtoList =  productService.getAllProducts();
        return productDtoList;
    }
}

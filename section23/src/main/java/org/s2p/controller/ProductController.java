package org.s2p.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController
{

    public String getProducts()
    {
        System.out.println("Hello Products API");
       return "Here Is The List Of Products";
    }
}

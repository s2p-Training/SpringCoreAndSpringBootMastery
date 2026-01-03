package org.s2p.service;

import org.s2p.entity.Product;

import java.util.List;

public interface ProductService
{
    List<Product> fetchAllProducts();
}

package org.s2p.service;

import lombok.RequiredArgsConstructor;
import org.s2p.entity.Product;
import org.s2p.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService
{
    private final ProductRepository productRepository;

    @Override
    public List<Product> fetchAllProducts() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }
}

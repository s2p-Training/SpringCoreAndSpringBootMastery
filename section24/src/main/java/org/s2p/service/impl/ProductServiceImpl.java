package org.s2p.service.impl;

import lombok.RequiredArgsConstructor;
import org.s2p.dto.ProductDto;
import org.s2p.entity.Product;
import org.s2p.repository.ProductRepository;
import org.s2p.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService
{
    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> getAllProducts()
    {
        List<ProductDto> productList =  productRepository.findAll().stream().map(this::transformToDTO).toList();
        return productList;
    }

    private ProductDto transformToDTO(Product product)
    {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        return productDto;
    }
}

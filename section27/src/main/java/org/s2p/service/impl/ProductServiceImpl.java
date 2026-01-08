package org.s2p.service.impl;

import lombok.RequiredArgsConstructor;
import org.s2p.dto.ProductDto;
import org.s2p.entity.Product;
import org.s2p.repository.ProductRepository;
import org.s2p.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService
{
    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> fetchAllProducts()
    {

        List<Product> productList = productRepository.findAll();

        List<ProductDto> productDtoList = new ArrayList<>(productList.size());

        for(int i=0; i < productList.size(); i++)
        {
            productDtoList.add(transformToDTO(productList.get(i)));
        }

        return productDtoList;
    }

    private ProductDto transformToDTO(Product product)
    {
        // Transforming Product Entity Into ProductDto
        ProductDto productDto = new ProductDto();

//        // Fetching And Setting The ProductId
//        Long productId            = product.getProductId();
//        productDto.setProductId(productId);
//
//        // Fetching And Setting The ProductName
//        String productName        = product.getName();
//        productDto.setName(productName);
//
//        // Fetching And Setting The ProductDescription
//        String productDescription = product.getDescription();
//        productDto.setDescription(productDescription);
//
//        // Fetching And Setting The ProductPrice
//        BigDecimal productPrice   = product.getPrice();
//        productDto.setPrice(productPrice);
//
//        // Fetching And Setting The ProductPopularity
//        Integer productPopularity = product.getPopularity();
//        productDto.setPopularity(productPopularity);
//
//        // Fetching And Setting The ProductImageUrl
//        String productImageUrl    = product.getImageUrl();
//        productDto.setImageUrl(productImageUrl);
//
//        // Fetching And Setting The ProductCreatedAt
//        Instant productCreatedAt  = product.getCreatedAt();
//        productDto.setCreatedAt(productCreatedAt);

        BeanUtils.copyProperties(product,productDto);

        return productDto;
    }

}

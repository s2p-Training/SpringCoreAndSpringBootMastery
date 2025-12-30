package org.s2p.service;

import org.s2p.dto.ProductDto;
import org.s2p.entity.Product;

import java.util.List;

public interface IProductService
{
    List<ProductDto> getAllProducts();
}

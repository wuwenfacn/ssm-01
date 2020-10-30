package com.fa.service.impl;

import com.fa.entity.Product;
import com.fa.mapper.ProductMapper;
import com.fa.service.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ProductServiceimpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public List<Product> findAll() {
        List<Product> products = productMapper.selectList();
        return products;
    }
}

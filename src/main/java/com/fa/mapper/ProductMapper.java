package com.fa.mapper;

import com.fa.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductMapper {
    List<Product> selectList();
}

package com.fa.service;

import com.fa.request.CartsRequestParams;
import com.fa.vo.CartsVo;

import java.util.List;

public interface CartsService {
    /*添加购物车*/
    int saveCarts(CartsRequestParams cartsRequestParams);
    /*通过id查询购物车*/
    List<CartsVo> findAllCarts(int userId);
}

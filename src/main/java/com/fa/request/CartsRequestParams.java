package com.fa.request;

import lombok.Data;

/*
* 购物车实体参数类
* */
@Data
public class CartsRequestParams {
    private int userId;
    private int cartsNum;
    private int productId;
}

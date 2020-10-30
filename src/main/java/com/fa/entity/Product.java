package com.fa.entity;

import lombok.Data;

import java.io.Serializable;

/*create table product
        (
        product_id int auto_increment primary key ,
        name varchar(20) not null ,
        status int default 1 not null
        )*/

/*
* 商品表
* */
@Data
public class Product  implements Serializable {

    /*
    * 商品id
    * */
    private Integer productId;

    /*
    * 商品名
    * */
    private String name;

    /*
    * 商品是否删除状态码
    * */
    private Integer status;

}

package com.fa.entity;

import lombok.Data;

import java.io.Serializable;

/*create table carts
(
    carts_id int auto_increment primary key comment '主键id',
    carts_num int not null comment '商品的数量',
    product_id int not null comment '商品的外键',
    user_id int not null comment '用户id',
    delete_status int default 1 comment '删除的状态码，1表示正常，0表示删除'
)*/

/*
* 购物车
* */
@Data
public class Carts implements Serializable {

    /*
    * 商品的主键id
    * */
    private Integer cartsId;

    /*
    * 商品的数量
    * */
    private Integer cartsNum;

    /*
    * 商品的外键
    * */
    private Integer productId;

    /*
    * 用户id
    * */
    private Integer userId;

    /*
    * 删除的状态码，1表示正常，0表示删除
    * */
    private Integer deleteStatus;

}

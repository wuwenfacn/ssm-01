package com.fa.entity;

import lombok.Data;

import java.io.Serializable;

/*create table user
        (
        user_id int auto_increment primary key comment '主键id',
        user_name varchar(20) not null comment '用户名',
        user_password varchar(20) not null comment '用户密码',
        delete_status int default 1 not null comment '1表示正常，0表示删除'
        )comment '用户信息表';*/

/*
* 用户信息表
* */
@Data
public class User implements Serializable {
    /**
     * 主键id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 1表示正常，0表示删除
     */
    private Integer deleteStatus;

}


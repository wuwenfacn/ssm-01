package com.fa.mapper;

import com.fa.entity.Carts;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartsMapper {

    /*添加购物车*/
    int insert(Carts carts);

    /**/
    Carts selectByUserIdAndProductId(@Param("userId") int userId, @Param("productId") int productId);

    /*删除购物车商品*/
    int update(Carts carts);

    /*修改购物车商品数量*/
    int updateById(@Param("cartsId") int cartsId, @Param("cartsNum") int cartsNum);

    /*根据用户id查看购物车*/
    List<Carts> selectList(@Param("userId")int userId);
}

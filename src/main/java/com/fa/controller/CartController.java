package com.fa.controller;

import com.fa.entity.Carts;
import com.fa.request.CartsRequestParams;
import com.fa.service.CartsService;
import com.fa.utils.ResponseEntity;
import com.fa.vo.CartsVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 购物车功能
 * 1.添加购物车
 *  1.1 如果购车商品已经存在  直接数量相加
 *  1.2 如果不存在就创建该条记录
 * 2.查看购物车
 * 3.删除购物车
 * 4.修改商品的数量
 * 5 加入收藏夹功能
 */
@Controller
@RestController
@RequestMapping("/carts")
public class CartController {
    @Resource
    CartsService cartsService;

    /*通过id查询购物车*/
    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<CartsVo>> list(@RequestParam("userId") int userId){
        try{
            List<CartsVo> allCarts = cartsService.findAllCarts(userId);
            return ResponseEntity.success(allCarts);
        }catch (Exception e){
            return ResponseEntity.error();
        }
    }

    /*添加购物车*/
    @PostMapping("/add")
    public ResponseEntity<Boolean> add(CartsRequestParams cartsRequestParams){
        boolean flag = false;
        try{
            int i = cartsService.saveCarts(cartsRequestParams);
            if(i > 0){
                return ResponseEntity.success(true);
            }else {
                return ResponseEntity.error();
            }
        }catch (Exception e){
            return ResponseEntity.error();
        }
    }

    /*删除购物车*/
    @PutMapping("/del")
    public List<Carts> del(@RequestParam List<Integer> cartsId){
        return null;
    }

    /*修改购物车数量*/
    @PutMapping("/update")
    public List<Carts> updateNum(@RequestParam int cartsId){
        return null;
    }
}
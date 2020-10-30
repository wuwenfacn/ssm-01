package com.fa.controller;

import com.fa.entity.Product;
import com.fa.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductService productService;

    @GetMapping("/list")
    @ResponseBody
    public List<Product> list(){
        List<Product> all = null;
        try{
            all = productService.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
}

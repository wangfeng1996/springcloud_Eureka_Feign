package com.wang.consumer.controller;


import com.wang.consumer.domain.Goods;
import com.wang.consumer.feign.GoodsFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private GoodsFeignClient feignClient;


    @GetMapping("/goods/{id}")
    public Goods findGoodsById(@PathVariable("id") int id) {
        Goods goods = feignClient.findOne(id);
        return goods;
    }


}

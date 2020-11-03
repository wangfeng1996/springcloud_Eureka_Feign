package com.wang.consumer.feign;

import com.wang.consumer.domain.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 一只永不言弃的小乌龟
 * @create 2020/11/3 8:15 下午
 */
@FeignClient(value = "FEIGN-PROVIDER")
public interface GoodsFeignClient {

    @GetMapping("/goods/findOne/{id}")
    public Goods findOne(@PathVariable("id") int id);

}

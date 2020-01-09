package com.company.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "provider", fallback = FeignServiceError.class)
public interface FeignService {

    @GetMapping("/provider/callProviderByRest")   //如果有项目名需要把项目名也加上 浪费我一个半小时 我CNM
    String callProviderByRest();

//    @GetMapping("/product/listForOrder")
//    List<Object> listForOrder(@RequestBody List<String> productIdList);
}

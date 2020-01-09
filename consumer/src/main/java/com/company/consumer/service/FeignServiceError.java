package com.company.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceError implements FeignService{
    @Override
    public String callProviderByRest() {
        return "发生熔断错误";
    }
}

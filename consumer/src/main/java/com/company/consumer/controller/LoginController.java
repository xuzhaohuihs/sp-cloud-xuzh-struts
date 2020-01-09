package com.company.consumer.controller;

import com.company.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoginController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignService feignService;
    @GetMapping(value = "/hi", produces = {"text/plain;charset=UTF-8"})
    
    //@PreAuthorize("hasAuthority('p2')")  //方法授权,不知道为什么 再websecirotuConfig中设置不好用
    public  String r1(){
        return "/的页面";
    }


    @GetMapping(value = "/callProviderByRest", produces = {"text/plain;charset=UTF-8"})
    public  String callProviderByRest(){
        return  feignService.callProviderByRest();
    }

}

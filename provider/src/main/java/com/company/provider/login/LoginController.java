package com.company.provider.login;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    double num = Math.random();
    @GetMapping(value = "/callProviderByRest", produces = {"text/plain;charset=UTF-8"})
    public  String callProviderByRest(){
        return  "我是provider " + num ;
    }


}

package com.company.providerhystrix.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    double num = Math.random();
    @GetMapping(value = "/callProviderByRest", produces = {"text/plain;charset=UTF-8"})
    public  String callProviderByRest(){
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        int i = 1/0;
        return  "我是provider " + num ;
    }


}

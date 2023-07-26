package com.clientui.clientui.controller;

import com.clientui.clientui.proxies.MicroserviceProduitsProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final MicroserviceProduitsProxy produitsProxy;

    public TestController(MicroserviceProduitsProxy produitsProxy){
        this.produitsProxy = produitsProxy;
    }

    @GetMapping("/test")
    String test(){
        return produitsProxy.testUnProduit();
    }
}

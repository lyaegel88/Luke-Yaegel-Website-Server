package com.yaegeltech.coolhandedluke.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping({"/", "", "/index"})
    public String index(){
        return "Hello World!";
    }
}

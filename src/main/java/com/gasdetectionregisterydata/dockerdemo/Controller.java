package com.gasdetectionregisterydata.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String test() {
        return  "hello world";
    }
}

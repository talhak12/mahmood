package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@RestController
public class UserController {

     @Autowired
    private Environment env;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World" + env.getProperty("local.server.port");
    }
}

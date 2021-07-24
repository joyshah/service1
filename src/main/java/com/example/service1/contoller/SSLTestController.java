package com.example.service1.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSLTestController {

    @GetMapping
    public String getData() {
        return "Hello World, This is Service 1";
    }
}

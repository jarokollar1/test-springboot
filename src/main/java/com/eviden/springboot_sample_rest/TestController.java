package com.eviden.springboot_sample_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("Test")
    public String Test() {
        return "Welcome Test 123";
    }
}

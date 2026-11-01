package com.firstproject.hello;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping
    public String hello()
    {
        return "Hello";
    }
    @GetMapping("bye")
    public String bye()
    {
        return "<i>Bye</i>";
    }
}
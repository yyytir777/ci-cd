package com.example.demo;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/health")
    public String healthCheck(){
        return "im healthy";
    }
}

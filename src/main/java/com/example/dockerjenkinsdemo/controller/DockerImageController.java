package com.example.dockerjenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerImageController {

    @GetMapping("/docker")
    public String messageInfo(){
        return "Hello Docker";
    }
}

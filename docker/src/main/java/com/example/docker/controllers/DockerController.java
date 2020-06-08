package com.example.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/")
public class DockerController {

    @GetMapping("hello")
    public String helloDocker() {
        return "Hello Docker World";
    }
}

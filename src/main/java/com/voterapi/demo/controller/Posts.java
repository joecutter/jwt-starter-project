package com.voterapi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class Posts {

    @PostMapping("/")
    public String addPosts(){
        String deal = "";

        return "";
    }

    @GetMapping("/")
    public String getPosts(){
        String deal = "";

        return "";
    }
}

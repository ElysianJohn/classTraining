package com.example.demo2.service;

import org.springframework.stereotype.Service;

@Service
public class helloServiceImpl {

    public String hello(){
        return "Hello World!";
    }

    public int add(Integer num){
        return num*2;
    }
}

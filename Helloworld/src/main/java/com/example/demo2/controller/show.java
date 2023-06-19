package com.example.demo2.controller;

import com.example.demo2.service.helloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class show {
    @Autowired
    helloServiceImpl helloService;
  @GetMapping("/hello")
    public String hello(){
      String str = helloService.hello();
      System.out.println(str);
      return str;
  }
}

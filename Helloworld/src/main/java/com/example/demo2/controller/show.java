package com.example.demo2.controller;

import com.example.demo2.service.helloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class show {
    @Value("${file.name:}")
    public String name;
    @Autowired
    helloServiceImpl helloService;
  @GetMapping("/hello")
    public String hello(){
      String str = helloService.hello();
      System.out.println(str);
      return str;
  }
    @GetMapping("/add/{num}")
    public int add(@PathVariable Integer num){
        return helloService.add(num);
    }

    @GetMapping("/name")
    public String name(){
        return name;
    }
}

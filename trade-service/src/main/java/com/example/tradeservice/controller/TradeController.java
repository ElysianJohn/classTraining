package com.example.tradeservice.controller;

import com.example.tradeservice.Feign.UserService;
import com.example.tradeservice.entity.Result;
import com.example.tradeservice.entity.User;
import com.example.tradeservice.service.TradeService;
import jakarta.annotation.Resource;
import jakarta.ws.rs.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TradeController {
     @Autowired
    TradeService tradeService;
    @Resource
     UserService userService;
    @RequestMapping ("/getUserbyId")
    public User getUser(@PathParam("id") Integer id){
        System.out.println("这是controller getUSer");
        System.out.println(id);
        return userService.getUserFeign(id);
    }
    @RequestMapping("/deleteUser")
    public Result deleteUser(@PathParam("id") Integer id){
        return userService.deleteUser(id);
    }
}

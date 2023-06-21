package com.example.demo2.controller;

import com.example.demo2.entity.Result;
import com.example.demo2.entity.User;
import com.example.demo2.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

/**
 * user增删改查
 */
@RestController

public class UserController {
    @Autowired
    private  UserServiceImpl userService;
    @RequestMapping("/getUserbyId")
     public User getUser(Integer id){
      return  userService.showUser(id);
    }

    @DeleteMapping("/deleteUserbyId")
    public Result deleteUser(Integer id){
        return  userService.deleteUser(id);
    }
    @PostMapping("/addUser")
    public Result addUser(String name,String email,String institute) throws ParseException {
        return userService.addUser(name,email,institute);
    }

    @PutMapping("/updateUser")
    public Result updateUser(Integer id,String name,String email,String institute) throws ParseException {
        return userService.updateUser(id,name,email,institute);
    }
}

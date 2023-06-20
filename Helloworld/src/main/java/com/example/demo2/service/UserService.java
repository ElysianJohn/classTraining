package com.example.demo2.service;

import com.example.demo2.entity.Result;
import com.example.demo2.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.text.ParseException;

/**
* @author 奥特曼
* @description 针对表【user】的数据库操作Service
* @createDate 2023-06-20 22:04:34
*/
public interface UserService extends IService<User> {
   Result showUser(Integer id);
   Result deleteUser(Integer id);

   Result updateUser(Integer id,String name,String email,String institute) throws ParseException;

   Result addUser(String name,String email,String institute) throws ParseException;
}

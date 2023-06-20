package com.example.demo2.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo2.entity.Result;
import com.example.demo2.entity.User;
import com.example.demo2.mapper.UserMapper;
import com.example.demo2.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
* @author 奥特曼
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-06-20 22:04:34
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    UserMapper userMapper;
    public Result showUser(Integer id){
        User user = userMapper.selectById(id);
        if(user==null){
            return Result.error();
        }
        return Result.ok()
                .data("User",user);
    }

   public Result deleteUser(Integer id){
        int result = userMapper.deleteById(id);
        if (result>0){
            return Result.ok();
        }
        else {
            return Result.error();
        }
   }

   public Result addUser(String name,String email,String institude) throws ParseException {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setInstitute(institude);
        user.setInsert_id("1");

       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
       String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
       user.setInsert_ts(df.parse(date));

        int result=userMapper.insert(user);
       if (result>0){
           return Result.ok();
       }
       else {
           return Result.error();
       }
   }
    public Result updateUser(Integer id,String name,String email,String institute) throws ParseException {
        User user = new User();
        user.setUserId(id);
        user.setName(name);
        user.setEmail(email);
        user.setInstitute(institute);
        user.setUpdate_id("1");

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        user.setUpdate_ts(df.parse(date));

        int result=userMapper.updateById(user);
        System.out.println(id);
        if (result>0){
            return Result.ok();
        }
        else {
            return Result.error();
        }
    }
}





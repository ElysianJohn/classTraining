package com.example.demo2.mapper;

import com.example.demo2.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 奥特曼
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-06-20 22:04:34
* @Entity com.example.demo2.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}





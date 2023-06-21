package com.example.demo2.mapper;

import com.example.demo2.entity.Trade;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 张甲汶
* @description 针对表【trade】的数据库操作Mapper
* @createDate 2023-06-21 08:26:38
* @Entity com.example.demo2.entity.Trade
*/
@Mapper
public interface TradeMapper extends BaseMapper<Trade> {

}





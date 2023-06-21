package com.example.demo2.controller;

import com.example.demo2.entity.Result;
import com.example.demo2.service.impl.TradeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.text.ParseException;

public class tradeController {

    private TradeServiceImpl tradeService;

//    @GetMapping("/gettradebyId")
//    public Result gettradebyId(Integer id){
//        return  tradeService.gettradebyId(id);
//    }
//
//    @DeleteMapping("/deletetradebyId")
//    public Result deleteTrade(Integer id){
//        return  tradeService.deleteTrade(id);
//    }
//    @PostMapping("/addtrade")
//    public Result addTrade(String name,String email,String institute) throws ParseException {
//        return tradeService.addTrade(name,email,institute);
//    }
//
//    @PutMapping("/updatetrade")
//    public Result updateTrade(Integer id,String name,String email,String institute) throws ParseException {
//        return tradeService.updateTrade(id,name,email,institute);
//    }
}

package com.example.tradeservice.service;

import com.example.tradeservice.entity.User;
import jakarta.annotation.Resource;
import org.aspectj.apache.bcel.classfile.InnerClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.Result;

@Service
public class TradeService {
    @Resource
    private RestTemplate restTemplate;

   public String getUser(Integer id){

       String str = restTemplate.getForObject("http://localhost:8081/getUserbyId?id="+id.toString(),String.class);
       System.out.println(str);
       return str;
   }
}

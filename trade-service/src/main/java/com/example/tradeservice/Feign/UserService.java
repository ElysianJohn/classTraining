package com.example.tradeservice.Feign;

import com.example.tradeservice.entity.Result;
import com.example.tradeservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(name = "client01")
@Service
public interface UserService {
    @GetMapping("/getUserbyId")
    User getUserFeign(@RequestParam(value= "id")Integer id);

    @DeleteMapping("/deleteUserbyId")
    Result deleteUser(@RequestParam(value = "id") Integer id);
}

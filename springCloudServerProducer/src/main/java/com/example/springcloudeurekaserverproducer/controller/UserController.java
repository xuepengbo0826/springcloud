package com.example.springcloudeurekaserverproducer.controller;

import com.example.springcloudeurekaserverproducer.vo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/17 10:31
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public User getUser(){
        System.out.println("111");
        return new User("薛蓬勃", "男", "28");
    }
}

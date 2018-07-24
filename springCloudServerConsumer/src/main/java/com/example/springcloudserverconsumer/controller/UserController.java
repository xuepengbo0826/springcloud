package com.example.springcloudserverconsumer.controller;

import com.example.springcloudserverconsumer.service.UserSevice;
import com.example.springcloudserverconsumer.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/17 10:47
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserSevice userSevice;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public User getUser(){
        return userSevice.getUser();
    }
}

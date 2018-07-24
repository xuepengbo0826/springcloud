package com.example.springcloudserverconsumer.service;

import com.example.springcloudserverconsumer.fallback.UserServiceFallBack;
import com.example.springcloudserverconsumer.fallbackFactory.HystrixClientFallbackFactory;
import com.example.springcloudserverconsumer.vo.User;
import configuration.LoadConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/17 11:00
 * @Description:
 */
@Service
@FeignClient(name = "SpringCloudEurekaServerProducer", configuration = LoadConfiguration.class, fallbackFactory = HystrixClientFallbackFactory.class/*, fallback = UserServiceFallBack.class*/)
public interface UserSevice {

    @RequestMapping(value = "user/user", method = RequestMethod.GET)
    User getUser();
}

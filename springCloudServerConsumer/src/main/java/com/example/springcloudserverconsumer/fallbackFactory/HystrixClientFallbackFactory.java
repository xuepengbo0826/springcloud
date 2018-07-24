package com.example.springcloudserverconsumer.fallbackFactory;

import com.example.springcloudserverconsumer.fallback.UserServiceFallBack;
import com.example.springcloudserverconsumer.service.UserSevice;
import com.example.springcloudserverconsumer.vo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/23 11:13
 * @Description:
 */
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<UserSevice> {

    @Override
    public UserSevice create(Throwable cause) {
        return new UserServiceFallBack() {
            @Override
            public User getUser() {
                System.out.println("fallback; reason was: " + cause.getMessage());
                return new User("错误", "错误", "错误");
            }
        };
    }
}

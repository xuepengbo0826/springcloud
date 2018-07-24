package com.example.springcloudserverconsumer.fallback;

import com.example.springcloudserverconsumer.service.UserSevice;
import com.example.springcloudserverconsumer.vo.User;
import org.springframework.stereotype.Component;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/20 16:15
 * @Description:
 */
@Component
public class UserServiceFallBack implements UserSevice {

    @Override
    public User getUser() {
        return new User("错误", "错误", "错误");
    }
}

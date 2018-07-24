package com.example.springcloudeurekaserverproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/17 10:25
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServerProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerProducerApplication.class, args);
    }
}

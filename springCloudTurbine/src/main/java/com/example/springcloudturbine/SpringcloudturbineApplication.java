package com.example.springcloudturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class SpringcloudturbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudturbineApplication.class, args);
    }
}

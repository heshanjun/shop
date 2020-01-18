package com.hsj.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hsj.service.mapper") //Mapper接口的包扫描
public class HsjServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HsjServiceProviderApplication.class, args);
    }

}

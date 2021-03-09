package com.nb.springboot.nboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nb.springboot.nboot.mapper")
public class NbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbootApplication.class, args);
    }

}

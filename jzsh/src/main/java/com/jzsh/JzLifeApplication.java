package com.jzsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.jzsh.mapper")
@SpringBootApplication
public class JzLifeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JzLifeApplication.class, args);
    }

}

package com.laowang.springretry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableRetry
@EnableSwagger2
@SpringBootApplication
public class SpringretryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringretryApplication.class, args);
    }

}

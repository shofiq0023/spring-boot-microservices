package com.studentresult;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentResultServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentResultServiceApplication.class, args);
    }

}

package com.studentdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentDiscoveryServerApplication.class, args);
    }

}

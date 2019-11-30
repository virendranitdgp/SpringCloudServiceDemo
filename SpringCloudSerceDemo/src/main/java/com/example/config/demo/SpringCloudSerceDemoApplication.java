package com.example.config.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudSerceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSerceDemoApplication.class, args);
    }

}

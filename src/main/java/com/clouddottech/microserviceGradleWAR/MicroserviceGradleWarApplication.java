package com.clouddottech.microserviceGradleWAR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MicroserviceGradleWarApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGradleWarApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello Microservice Gradle WAR!";
    }
}

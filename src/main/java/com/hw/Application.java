package com.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "hello world with docker";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

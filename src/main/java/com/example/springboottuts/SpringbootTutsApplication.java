package com.example.springboottuts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootTutsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTutsApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Spring boot app";
    }

}


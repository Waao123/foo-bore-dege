package com.bore.foo.bore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(excludeName = "scanBasePackages=“controller")

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

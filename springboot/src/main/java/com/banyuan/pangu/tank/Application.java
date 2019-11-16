package com.banyuan.pangu.tank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableScheduling
@Transactional
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

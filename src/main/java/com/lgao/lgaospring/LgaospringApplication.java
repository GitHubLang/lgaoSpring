package com.lgao.lgaospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LgaospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LgaospringApplication.class, args);
    }

}

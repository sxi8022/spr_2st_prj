package com.sparta.sprmemoex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SprMemoExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprMemoExApplication.class, args);
    }

}

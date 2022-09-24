package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("00001--------版本");
        System.out.println("00002--------版本");
        System.out.println("00003--------版本");
        System.out.println("00004--------版本");
        System.out.println("00005----master----版本");
        System.out.println("00005---dev-----版本");
        System.out.println("00005---push-----版本");
    }

}

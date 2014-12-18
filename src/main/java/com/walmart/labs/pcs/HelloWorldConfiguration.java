package com.walmart.labs.pcs;

/**
 * Created by pzhong1 on 12/11/14.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class HelloWorldConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldConfiguration.class, args);
    }

}
package com.dataanalyzer.twitterpostconsumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class TwitterPostConsumerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TwitterPostConsumerServiceApplication.class, args);

    }
}

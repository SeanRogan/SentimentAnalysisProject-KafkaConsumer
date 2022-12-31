package com.dataanalyzer.twitterpostconsumerservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic configureOutputTopic() {
        return TopicBuilder.name("processed-tweets").build();
    }
}

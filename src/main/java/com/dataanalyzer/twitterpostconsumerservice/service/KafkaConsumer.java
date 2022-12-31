package com.dataanalyzer.twitterpostconsumerservice.service;

import com.netflix.discovery.EurekaNamespace;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Service;

@Service
@EnableKafka
public class KafkaConsumer implements MessageListener<String,String> {

    //called when a message hit the topic
    @Override
    public void onMessage(ConsumerRecord<String, String> stringStringConsumerRecord) {
        System.out.println("consumed tweet:" + stringStringConsumerRecord);
    }
}

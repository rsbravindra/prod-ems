package com.prod.ems.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeKafkaConsumer {
    @KafkaListener(topics = "employee-topic", groupId = "employee-group")
    public void listenEmployeeEvents(String message) {
        System.out.println("Received Kafka Message: " + message);
    }
}

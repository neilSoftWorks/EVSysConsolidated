package com.example.applicationsystem;

import com.example.shared.SharedEventDetails; // Import from Shared module
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

    private static final Logger logger = LoggerFactory.getLogger(EventPublisher.class);

    @Autowired
    private KafkaTemplate<String, SharedEventDetails> kafkaTemplate;

    public void publishEvent(SharedEventDetails eventDetails) {
        kafkaTemplate.send("events-topic", eventDetails);
        logger.info("Published event to Events module: {}", eventDetails);
    }
}
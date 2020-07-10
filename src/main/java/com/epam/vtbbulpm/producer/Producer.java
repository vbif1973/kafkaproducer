package com.epam.vtbbulpm.producer;

import com.epam.vtbbulpm.nci.avro.model.NciChangeEvent;
import com.epam.vtbbulpm.nci.avro.model.Type;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

@Slf4j
public class Producer {

    @Value("${spring.kafka.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, NciChangeEvent> kafkaTemplate;

    public void send() {
        NciChangeEvent event = new NciChangeEvent("dict1",
                "key1",
                Type.CREATE,
                UUID.randomUUID().toString(),
                System.currentTimeMillis());
        log.info("sending event='{}'", event.toString());
        kafkaTemplate.send(topic, event);
    }


}

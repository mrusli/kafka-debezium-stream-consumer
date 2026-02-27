package com.pyramix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDebeziumStreamConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDebeziumStreamConsumerApplication.class, args);
	}

}

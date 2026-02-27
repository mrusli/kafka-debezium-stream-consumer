package com.pyramix.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaConsumer {

	@KafkaListener(topics = {"user_company_topic_02"})
	public void listen_04(ConsumerRecord<String, String> event) {
		log.info(event.toString());
	}
	
	@KafkaListener(topics = {"user_with_roles_topic_02"})
	public void listen_05(ConsumerRecord<String, String> event) {
		log.info(event.toString());
	}

}

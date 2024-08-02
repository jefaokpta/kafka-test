package com.example.testkafka

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 7/31/24
 */
@Service
class Consumer {

    private val log = LoggerFactory.getLogger(this::class.java)

@KafkaListener(topics = ["cdr-topic"], groupId = "group-1")
    fun receiveMessage(message: String) {
        log.info("Received message: $message")
    }
}
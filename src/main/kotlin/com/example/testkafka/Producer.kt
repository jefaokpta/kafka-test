package com.example.testkafka

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 7/31/24
 */
@Service
class Producer(private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun sendMessage(message: String) {
        kafkaTemplate.send("cdr-topic", "cdr", message)
    }
}

@RestController
@RequestMapping("/kafka")
class KafkaController(private val producer: Producer) {

    @PostMapping("/send")
    fun sendMessage(@RequestParam message: String) {
        producer.sendMessage(message)
    }
}
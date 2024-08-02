package com.example.testkafka

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Disabled
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.concurrent.TimeUnit

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 7/31/24
 */
@Disabled
@SpringBootTest
class ProducerTest(@Autowired private val producer: Producer) {

    @Test
    fun sendMessage() {
        producer.sendMessage("Hello, Kafka!")
        TimeUnit.SECONDS.sleep(10000)
    }
}
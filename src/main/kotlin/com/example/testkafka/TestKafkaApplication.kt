package com.example.testkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestKafkaApplication

fun main(args: Array<String>) {
	runApplication<TestKafkaApplication>(*args)
}

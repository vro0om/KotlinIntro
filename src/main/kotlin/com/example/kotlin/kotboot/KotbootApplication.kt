package com.example.kotlin.kotboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotbootApplication

fun main(args: Array<String>) {
	runApplication<KotbootApplication>(*args)
}

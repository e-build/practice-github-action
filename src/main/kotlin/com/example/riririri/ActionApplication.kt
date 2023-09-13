package com.example.riririri

import jakarta.annotation.PostConstruct
import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties
import org.springframework.boot.runApplication

@SpringBootApplication
class ActionApplication(
    private val hibernateProperties: HibernateProperties
){

    val logger = KotlinLogging.logger {}

    @PostConstruct
    fun init() {
        logger.info { hibernateProperties }
    }

}

fun main(args: Array<String>) {
    runApplication<ActionApplication>(*args)
}

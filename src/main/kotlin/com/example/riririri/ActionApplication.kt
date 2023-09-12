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
        logger.info { hibernateProperties }
    }

}

fun main(args: Array<String>) {
    runApplication<ActionApplication>(*args)
}

// 1. Check Lint And Test
//   - lint
//   - unit test
//   - integration test
//   - run coverage
//   - upload test result
//   - upload coverage result

// 2-A. Build Alpha
//   -
// 2-B. Build Prod
//   - jacoco -> build
// 2. Release
// -  -> image build -> imgage push to ECR
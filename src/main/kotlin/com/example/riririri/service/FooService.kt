package com.example.riririri.service

import mu.KotlinLogging
import org.springframework.stereotype.Service

@Service
class FooService {

    val logger = KotlinLogging.logger {}

    fun foo() {
        logger.info { "executed code" }
        if (1 == 2) {
            logger.info { "do not executed code" }
        }
    }
}
package com.example.riririri.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    @Value("\${app.version:1.0.0}")
    lateinit var version: String

    @GetMapping("/health")
    fun healthCheck(): String {
        return "OK : ${version}"
    }

}
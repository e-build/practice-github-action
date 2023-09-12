package com.example.riririri.service

import com.example.riririri.configuration.IntegrationTest
import org.junit.jupiter.api.Test

@IntegrationTest
class FooServiceIT {

    @Test
    fun tc1(){
        val sut = FooService();
        sut.foo2()
    }
}
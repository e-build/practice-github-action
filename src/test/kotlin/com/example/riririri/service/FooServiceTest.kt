package com.example.riririri.service

import com.example.riririri.configuration.UnitTest
import org.junit.jupiter.api.Test

@UnitTest
class FooServiceTest {

    @Test
    fun tc1(){
        val sut = FooService();
        sut.foo1()
    }
}
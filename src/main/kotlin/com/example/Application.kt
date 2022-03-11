package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    embeddedServer(Netty, port = 18080, host = "0.0.0.0") {
        configureRouting()
        configureTemplating()
        configureSerialization()
    }.start(wait = true)
}
package com.escape_sequence.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EscapeSequenceServerApplication

fun main(args: Array<String>) {
    runApplication<EscapeSequenceServerApplication>(*args)
}

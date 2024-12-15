package com.whoami.whoamiSpring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WhoamiSpringApplication

fun main(args: Array<String>) {
    runApplication<WhoamiSpringApplication>(*args)
}

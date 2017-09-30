package org.cocktail.gfc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class GfcServicesApplication

fun main(args: Array<String>) {
    SpringApplication.run(GfcServicesApplication::class.java, *args)
}
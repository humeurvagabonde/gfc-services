package org.cocktail.gfc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class GfcServicesApplication : SpringBootServletInitializer()

fun main(args: Array<String>) {
    SpringApplication.run(GfcServicesApplication::class.java, *args)
}
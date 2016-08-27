package com.nearsoft.conf

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * This is the main class of the project
 */

@SpringBootApplication
class Application {

    def static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
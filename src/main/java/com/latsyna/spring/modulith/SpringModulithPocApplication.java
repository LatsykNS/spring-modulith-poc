package com.latsyna.spring.modulith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * The main application class.
 */
@EnableAsync
@SpringBootApplication
public class SpringModulithPocApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringModulithPocApplication.class, args);
  }

}

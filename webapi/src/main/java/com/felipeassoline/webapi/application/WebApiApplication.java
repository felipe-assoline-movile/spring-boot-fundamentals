package com.felipeassoline.webapi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


//@SpringBootApplication
@SpringBootConfiguration
//@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.felipeassoline.webapi"})
@Import({
        ServletWebServerFactoryAutoConfiguration.class,
        DispatcherServletAutoConfiguration.class
})
public class WebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApiApplication.class, args);
    }
}

package com.felipeassoline.webapi.configuration;

import com.felipeassoline.customservice.CustomService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean
    public CustomService customService() {
        return new CustomService("myDefaultValue");
    }
}

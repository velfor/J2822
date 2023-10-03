package org.example.config;

import org.example.Iphone;
import org.example.Samsung;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Iphone Iphone(){
        return new Iphone(Samsung());
    }
    @Bean
    public Samsung Samsung(){
        return new Samsung();
    }
}

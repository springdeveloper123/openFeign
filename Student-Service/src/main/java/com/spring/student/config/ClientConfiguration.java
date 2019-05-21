package com.spring.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.codec.ErrorDecoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;

@Configuration
public class ClientConfiguration {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new ErrorDecoder.Default();
    }

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }
    
    @Bean
    public Decoder decoder() {
        return new GsonDecoder();
    }
    
    @Bean
    public Encoder encoder() {
        return new GsonEncoder();
    }
}
package com.micro.consumer;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfiguration {

    public static final String smsQueue = "sms-queue";

    public static final String mailQueue = "mail-queue";

    public static final String resultback = "resultback-queue";


    @Bean
    public MessageConverter create() {
        return new Jackson2JsonMessageConverter();
    }

}

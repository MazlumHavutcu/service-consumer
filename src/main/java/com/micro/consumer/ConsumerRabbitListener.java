package com.micro.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class ConsumerRabbitListener {


    @RabbitListener(queues = RabbitConfiguration.smsQueue)
    public void smsListener(final CustomerDto customerDto) {
        System.out.println("Send SMS"+customerDto);
    }

    @RabbitListener(queues = RabbitConfiguration.mailQueue)
    @SendTo(RabbitConfiguration.resultback)
    public String mailListener(final CustomerDto customerDto) {
        System.out.println("Send MAIL"+customerDto);
        return "OK";
    }

}

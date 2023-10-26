package com.microservices.email.consumers;

import com.microservices.email.dtos.EmailRecordDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRecordDTO emailRecordDTO) {
        System.out.println(emailRecordDTO.emailTo());
    }
}

//    public void listenEmailQueue(@Payload String string) {
////        System.out.println(string);
////    }
package com.ahmedzahran.rabbitmqtutorial.consumer;

import com.ahmedzahran.rabbitmqtutorial.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQJsonConsumer {

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeJsonMessage(User user){
        log.info(String.format("Received message -> %s",user.toString()));

    }
}

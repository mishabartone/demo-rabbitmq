package ru.examplerabbitmq.demorabbitmq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.examplerabbitmq.demorabbitmq.dto.User;
import ru.examplerabbitmq.demorabbitmq.publisher.RabbitMQJsonProducer;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController {
    private RabbitMQJsonProducer jsonProducer;

    public MessageJsonController(RabbitMQJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    // http://localhost:8080/api/v1/publish?message=hello
    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody() User user) {
        jsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("JSON message sent to RabbitMQ ...");
    }
}

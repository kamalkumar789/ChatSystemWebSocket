package com.example.ChatSystemWebSocket.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class WebSocketController {


    @MessageMapping("/sendmessage")
    @SendTo("/emp/greetings")
    public String sendMessage(String message){
        return message;
    }
}

package com.example.ChatSystemWebSocket.Config;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry){
        //topic or broker a prefix of broker
        registry.enableSimpleBroker("/emp");
        //prefix of sending message endpoints
        registry.setApplicationDestinationPrefixes("/es");
    }
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //Used to establish connection from client to server.
        registry.addEndpoint("/websocket").setAllowedOriginPatterns("*").withSockJS();
    }
}

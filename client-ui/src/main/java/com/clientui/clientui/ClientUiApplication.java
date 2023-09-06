package com.clientui.clientui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.clientui")
public class ClientUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientUiApplication.class, args);
    }

}


//  https://www.youtube.com/watch?v=lh1oQHXVSc0&list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c&index=2
//  https://medium.com/geekculture/how-jwt-is-implemented-in-api-gateway-on-microservice-architecture-5dce8f5b89aa
//  https://geekflare.com/fr/securing-microservices/
//  https://springframework.guru/jwt-authentication-in-spring-microservices-jwt-token/
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

//  https://github.com/in28minutes/spring-microservices-v3/tree/main/05.kubernetes/01-step-by-step-changes

//  https://github.com/Dyngela/microservices-template/blob/master/integration/Dockerfile

//  https://javaetmoi.com/2019/11/desendettement-de-spring-cloud-netflix/

//  https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.2.0.RC2/reference/html/

//  https://phumipatc.medium.com/how-to-install-mongodb-to-docker-f17cec2b1f8f

//  https://earthly.dev/blog/mongodb-docker/
//  https://medium.com/geekculture/how-jwt-is-implemented-in-api-gateway-on-microservice-architecture-5dce8f5b89aa
//  https://geekflare.com/fr/securing-microservices/
//  https://springframework.guru/jwt-authentication-in-spring-microservices-jwt-token/
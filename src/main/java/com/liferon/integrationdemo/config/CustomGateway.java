package com.liferon.integrationdemo.config;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface CustomGateway {
    @Gateway(requestChannel = "inputChannel")
    public void print(String message);
}

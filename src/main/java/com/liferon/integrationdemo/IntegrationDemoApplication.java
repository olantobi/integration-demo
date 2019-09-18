package com.liferon.integrationdemo;

import com.liferon.integrationdemo.config.CustomGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
@RequiredArgsConstructor
public class IntegrationDemoApplication implements ApplicationRunner {
    private final CustomGateway gateway;

    public static void main(String[] args) {
        SpringApplication.run(IntegrationDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        gateway.print("Hello World!");
    }
}

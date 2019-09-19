package com.liferon.integrationdemo.config;

import com.liferon.integrationdemo.service.PrintService;
import com.liferon.integrationdemo.service.ReverseService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

@Configuration
@EnableIntegration
@RequiredArgsConstructor
public class ServiceActivatorConfig {
    private final PrintService printService;
    private final ReverseService reverseService;

    @Bean
    IntegrationFlow getInvoice() {
        return IntegrationFlows.
                from("inputChannel")
                .handle(reverseService)
                .get();
    }
}

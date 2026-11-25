package com.GP51.RAASBackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class MistralConfig {

    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder()
                .requestInterceptor((request, body, execution) -> {
                    if (body.length > 0) {
                        request.getHeaders().setContentLength(body.length);
                    }
                    return execution.execute(request, body);
                });
    }
}

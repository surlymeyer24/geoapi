package ar.edu.utn.frc.grupo114.geoapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class WebClientConfig {

    @Value("${osrm.url}")
    private String osrmUrl;

    @Bean
    public WebClient osrmClient() {
        return WebClient.builder()
                .baseUrl(osrmUrl)
                .build();
    }
}

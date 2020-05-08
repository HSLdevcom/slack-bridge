package fi.hsl.slackbridge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SpringBeans {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

package fi.hsl.slackbridge.alerttoslack;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
class SlackService {
    private String webhookUrl;
    private RestTemplate restTemplate;

    @Autowired
    SlackService(@Value(value = "${slack.webhook.url}") String webhookUrl, RestTemplate restTemplate) {
        this.webhookUrl = webhookUrl;
        this.restTemplate = restTemplate;
    }

    void sendSlackMessage(SlackMessage slackMessage) throws JsonProcessingException {
        String json = new ObjectMapper().writeValueAsString(slackMessage);
        restTemplate.postForEntity(webhookUrl, json, String.class);
    }
}

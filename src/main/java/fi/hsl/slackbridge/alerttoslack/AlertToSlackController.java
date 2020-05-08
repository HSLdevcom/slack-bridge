package fi.hsl.slackbridge.alerttoslack;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
public class AlertToSlackController {
    @Autowired
    private SlackService slackService;

    @PostMapping(value = "/postToSlack/{username}/{channel}")
    public void postJsonToSlack(@PathVariable String username, @PathVariable String channel, @RequestBody String text) throws JsonProcessingException {
        log.info("Posting alert to slack: {}", text);
        SlackMessage slackMessage = new SlackMessage(username, text, channel);
        slackService.sendSlackMessage(slackMessage);
    }
}
package fi.hsl.slackbridge.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AzureToSlackMessage {
    private String channel;
    private String username;
    private String text;
}

package fi.hsl.slackbridge.alerttoslack;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Builder(builderClassName = "Builder")
@Data
class SlackMessage implements Serializable {
    private String username;
    private String channel;

    private List<SlackAttachment> attachments;

    SlackMessage(String username, String text, String channel) {
        attachments = new ArrayList<>();
        attachments.add(new SlackAttachment("Alert", "#2eb886", "Alert", username, "Alert", text));
        this.username = username;
        this.channel = channel;
    }


    @AllArgsConstructor
    @Data
    private static class SlackAttachment {
        private String fallback;
        private String color;
        private String pretext;
        private String author_name;
        private String title;
        private String text;

    }
}

package fi.hsl.slackbridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class HSLSlackBridge {

	public static void main(String[] args) {
		SpringApplication.run(HSLSlackBridge.class, args);
	}

}

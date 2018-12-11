package auto.rem.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigApplication {

	@Value("${config-app.message:none}")
	String message;


	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

	@GetMapping("/message")
	public String message() {
		return message;
	}
}

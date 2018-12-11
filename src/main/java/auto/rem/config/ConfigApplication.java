package auto.rem.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigApplication {


	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

	@GetMapping("/user")
	public String getUser() {
		return "not a config server user";
	}

	@GetMapping("/password")
	public String getPassword() {

		return "not a config server password";
	}
}

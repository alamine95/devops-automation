package sn.lamda.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DevopsApplication {

	@GetMapping
	public String Message() {return "Hello Word";}
	
	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

}

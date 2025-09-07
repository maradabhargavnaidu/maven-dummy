package me.maradabhargavnaidu.mbn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class MbnApplication extends SpringBootServletInitializer{
	@GetMapping("/")
	public String Hello() {
		return "Hello from Maven MBN";
	}
	@override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.soruces(MbnApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(MbnApplication.class, args);
	}

}

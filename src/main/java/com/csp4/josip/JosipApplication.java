package com.csp4.josip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class JosipApplication {

	public static void main(String[] args) {
		SpringApplication.run(JosipApplication.class, args);
	}

	@GetMapping({"/", "/index.html"})
	public String index() {
		return "forward:/index.html";
	}

}

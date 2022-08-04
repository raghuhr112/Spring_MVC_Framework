package com.xworkz.mvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.mvc")
@EnableWebMvc
public class SpringConfig {

	public SpringConfig() {

		System.out.println("From Spring Configuration Class");
	}

}

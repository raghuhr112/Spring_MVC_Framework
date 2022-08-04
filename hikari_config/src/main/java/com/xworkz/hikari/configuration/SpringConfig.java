package com.xworkz.hikari.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.xworkz.hikari")
@EnableWebMvc
public class SpringConfig {

	public SpringConfig() {

		System.out.println("Message From Spring Configuration");

	}

	@Bean
	public HikariDataSource dataSource() {

		HikariDataSource data = new HikariDataSource();

		data.setMaximumPoolSize(100);
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setJdbcUrl("jdbc:mysql://localhost:3306/xworkz-odc-btm");
		data.setUsername("root");
		data.setPassword("Xworkzodc@123");

		return data;

	}

}

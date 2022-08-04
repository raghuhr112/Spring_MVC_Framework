package com.xworkz.ott.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.ott")
@EnableWebMvc
public class Springconfig {

	public Springconfig() {
		System.out.println("Calling From Spring Configuration");
	}

//	@Bean
//	public DataSource datasource() {
//
//		DriverManagerDataSource data = new DriverManagerDataSource();
//
//		// "jdbc:mysql://localhost:3306/xworkz-odc-btm", "root","Xworkzodc@123"
//
//		data.setUrl("jdbc:mysql://localhost:3306/xworkz-odc-btm");
//		data.setUsername("root");
//		data.setPassword("Xworkzodc@123");
//		return data;
//
//	}

}

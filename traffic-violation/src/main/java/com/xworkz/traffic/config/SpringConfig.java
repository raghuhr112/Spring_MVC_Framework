package com.xworkz.traffic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.traffic")
@EnableWebMvc

public class SpringConfig {

	public SpringConfig() {

		System.out.println("From Spring Configuration Layer");
	}

	/*@Bean
	public DataSource datasource() {

		DriverManagerDataSource data = new DriverManagerDataSource();

		data.setDriverClassName("ccom.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource ");

		data.setUrl("jdbc:mysql://localhost:3306/xworkz-odc-btm");
		data.setUsername("root");
		data.setPassword("Xworkzodc@123");
		return data;*/

	}

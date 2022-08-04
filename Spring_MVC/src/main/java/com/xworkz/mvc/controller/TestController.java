package com.xworkz.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {
	
	
	public TestController() {

	System.out.println("From Test Controller");
	}

}

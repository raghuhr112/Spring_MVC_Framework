package com.xworkz.hikari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.hikari.dto.StudentDTO;
import com.xworkz.hikari.service.StudentService;

@Component
@RequestMapping("/")
public class SaveController {

	@Autowired
	public StudentService service;

	@PostMapping("/save.do")
	public String onSave(StudentDTO dto) {

		System.out.println("From Controller");

		boolean save = service.validateAndsave(dto);
		System.out.println(save);

		System.out.println(dto);

		return "index.html";

	}

}

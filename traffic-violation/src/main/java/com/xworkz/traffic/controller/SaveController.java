package com.xworkz.traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.traffic.dto.TrafficDTO;
import com.xworkz.traffic.service.TrafficService;

@Component
@RequestMapping("/")
public class SaveController {

	@Autowired
	public TrafficService service;

	public SaveController() {

		System.out.println("From Controller Layer");
	}

	@PostMapping("/save.do")
	public String onSave(TrafficDTO dto, Model model) {

		System.out.println("From Controller Layer");

		boolean save = service.validateAndSave(dto);
		System.out.println(save);

		return "index.jsp";
	}

}

package com.xworkz.bake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bake.dto.BakeryDTO;
import com.xworkz.bake.service.BakeryService;

@Component
@RequestMapping("/")
public class SaveController {

	@Autowired
	public BakeryService service;

	@PostMapping("/save.do")
	public String OnSave(BakeryDTO dto, Model model) {

		System.out.println("From Controller Layer");
		boolean save = service.validateAndSave(dto);
		System.out.println(dto);
		System.out.println(save);
		if (save) {
			model.addAttribute("msg", "Data Successfully Saved to DataBase");
			model.addAttribute("data", dto);

		} else {

			model.addAttribute("msg", "Data Failed to Save in DataBase");

		}

		return "successmsg.jsp";
	}

}

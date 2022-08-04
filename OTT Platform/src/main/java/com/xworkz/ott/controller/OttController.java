package com.xworkz.ott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ott.dto.OttDto;
import com.xworkz.ott.service.OttService;

@Component
@RequestMapping("/")
public class OttController {

	@Autowired
	private OttService service;

	public OttController() {
		System.out.println("Calling From OTT controller");
	}

	@PostMapping("/save.do")
	public String onSave(OttDto dto, Model model) {

		System.out.println("Calling Save Method");

		boolean save = service.validateAndSave(dto);
		System.out.println(save);
		if (save) {
			model.addAttribute("msg", "OTT Save is success from controller");
			model.addAttribute("data", dto);
			
		} else {
			model.addAttribute("msg", "OTT Save is failure");
		}
		return "Success.jsp";
	}

}

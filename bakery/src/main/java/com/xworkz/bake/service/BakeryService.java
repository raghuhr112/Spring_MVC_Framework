package com.xworkz.bake.service;

import org.springframework.stereotype.Component;

import com.xworkz.bake.dto.BakeryDTO;

@Component
public interface BakeryService {

	public boolean validateAndSave(BakeryDTO dto);

}

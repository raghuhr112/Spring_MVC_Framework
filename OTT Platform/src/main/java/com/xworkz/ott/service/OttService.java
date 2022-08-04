package com.xworkz.ott.service;

import org.springframework.stereotype.Component;

import com.xworkz.ott.dto.OttDto;

@Component
public interface OttService {

	public boolean validateAndSave(OttDto dto);

}

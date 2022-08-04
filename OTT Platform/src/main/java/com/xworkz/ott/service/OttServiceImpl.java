package com.xworkz.ott.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ott.dao.OttDAO;
import com.xworkz.ott.dto.OttDto;

@Component
public class OttServiceImpl implements OttService {

	@Autowired
	public OttDAO dao;

	@Override
	public boolean validateAndSave(OttDto dto) {

		System.out.println("From Service Layer");

		return dao.save(dto);
	}

}

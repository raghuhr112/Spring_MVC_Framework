package com.xworkz.traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.traffic.dao.TrafficDAO;
import com.xworkz.traffic.dto.TrafficDTO;

@Component
public class TrafficServiceImpl implements TrafficService {

	@Autowired
	public TrafficDAO dao;

	@Override
	public boolean validateAndSave(TrafficDTO dto) {

		System.out.println("From Service Layer");

		return dao.save(dto);
	}

}

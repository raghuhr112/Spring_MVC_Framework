package com.xworkz.hikari.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.hikari.dao.StudentDAO;
import com.xworkz.hikari.dto.StudentDTO;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentDAO dao;

	@Override
	public boolean validateAndsave(StudentDTO dto) {
		
		System.out.println("From Service Layer");

		return dao.save(dto);
	}

}

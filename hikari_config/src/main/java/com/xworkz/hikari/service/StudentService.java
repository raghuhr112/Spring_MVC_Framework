package com.xworkz.hikari.service;

import org.springframework.stereotype.Component;

import com.xworkz.hikari.dto.StudentDTO;

@Component
public interface StudentService {

	public boolean validateAndsave(StudentDTO dto);

}

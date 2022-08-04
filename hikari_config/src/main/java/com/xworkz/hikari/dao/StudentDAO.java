package com.xworkz.hikari.dao;

import org.springframework.stereotype.Component;

import com.xworkz.hikari.dto.StudentDTO;

@Component
public interface StudentDAO {

	public boolean save(StudentDTO dto);

}

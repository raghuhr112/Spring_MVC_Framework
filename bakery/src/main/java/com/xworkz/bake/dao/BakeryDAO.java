package com.xworkz.bake.dao;

import org.springframework.stereotype.Component;

import com.xworkz.bake.dto.BakeryDTO;

@Component
public interface BakeryDAO {

	public boolean save(BakeryDTO dto);

}

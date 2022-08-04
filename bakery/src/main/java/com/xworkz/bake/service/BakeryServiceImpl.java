package com.xworkz.bake.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bake.dao.BakeryDAO;
import com.xworkz.bake.dto.BakeryDTO;

@Component
public class BakeryServiceImpl implements BakeryService {

	@Autowired
	public BakeryDAO dao;

	@Override
	public boolean validateAndSave(BakeryDTO dto) {

		if (dto != null) {

			double itemPrice = dto.getItemPrice();
			int itemQty = dto.getItemQty();
			double totalPrice = dto.getTotalPrice();
			totalPrice = itemPrice * itemQty;

			System.out.println("From Service Layer");

		}
		return dao.save(dto);
	}

}

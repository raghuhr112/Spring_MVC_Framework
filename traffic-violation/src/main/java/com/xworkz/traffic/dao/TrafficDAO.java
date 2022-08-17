package com.xworkz.traffic.dao;

import org.springframework.stereotype.Component;

import com.xworkz.traffic.dto.TrafficDTO;

@Component
public interface TrafficDAO {

	public boolean save(TrafficDTO dto);

}

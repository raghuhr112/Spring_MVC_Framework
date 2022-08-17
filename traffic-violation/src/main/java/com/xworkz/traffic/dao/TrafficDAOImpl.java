package com.xworkz.traffic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import com.xworkz.traffic.dto.TrafficDTO;

@Component
public class TrafficDAOImpl implements TrafficDAO {

	@Override
	public boolean save(TrafficDTO dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException f) {
			f.printStackTrace();
		}

		String sql = "INSERT INTO traffic_violation VALUES(?,?,?,?)";

		try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz-odc-btm", "root",
				"Xworkzodc@123")) {

			PreparedStatement statement = connect.prepareStatement(sql);
			statement.setString(1, dto.getVehicleNo());
			statement.setString(2, dto.getPlace());
			statement.setTimestamp(3, Timestamp.valueOf(dto.getDateAndTime()));
			statement.setString(4, dto.getViolation());

			int rows = statement.executeUpdate();
			System.out.println(rows);
			return rows > 0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

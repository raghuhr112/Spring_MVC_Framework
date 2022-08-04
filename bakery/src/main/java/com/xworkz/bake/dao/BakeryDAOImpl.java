package com.xworkz.bake.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.xworkz.bake.dto.BakeryDTO;

@Component
public class BakeryDAOImpl implements BakeryDAO {

	public DataSource dataSource;

	@Override
	public boolean save(BakeryDTO dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException f) {
			f.printStackTrace();
		}

		String sql = "INSERT INTO cake_of_the_day VALUES(?,?,?,?,?,?)";

		try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz-odc-btm", "root",
				"Xworkzodc@123")) {

			PreparedStatement statement = connect.prepareStatement(sql);
			statement.setString(1, dto.getItemName());
			statement.setDouble(2, dto.getItemPrice());
			statement.setInt(3, dto.getItemQty());
			statement.setString(4, dto.getVendor());
			statement.setBoolean(5, dto.isVeg());
			statement.setDouble(6, dto.getTotalPrice());

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

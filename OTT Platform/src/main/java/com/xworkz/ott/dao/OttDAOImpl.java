package com.xworkz.ott.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ott.dto.OttDto;

@Component
public class OttDAOImpl implements OttDAO {

//	@Autowired
//	private DataSource dataSource;

	@Override
	public boolean save(OttDto dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException f) {
			f.printStackTrace();
		}

		String sql = "INSERT INTO ott_platform VALUES (?,?,?,?,?,?,?)";

		//try (Connection connect = dataSource.getConnection()) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz-odc-btm", "root",
				"Xworkzodc@123")) {

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, dto.getOtt());
			statement.setString(2, dto.getRegion());
			statement.setString(3, dto.getLang());
			statement.setString(4, dto.getPack());
			statement.setInt(5, dto.getSubscribers());
			statement.setString(6, dto.getSince());
			statement.setBoolean(7, dto.isStatus());

			int rows = statement.executeUpdate();
			System.out.println(rows);
			return rows > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}

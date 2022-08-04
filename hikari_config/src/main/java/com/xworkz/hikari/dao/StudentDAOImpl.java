package com.xworkz.hikari.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.hikari.dto.StudentDTO;
import com.zaxxer.hikari.HikariDataSource;

@Component
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private HikariDataSource data;

	@Override
	public boolean save(StudentDTO dto) {
		
		String sql = "INSERT INTO student_registration VALUES (?,?,?,?,?,?,?)";

		try (Connection connect = data.getConnection()) {

			PreparedStatement statement = connect.prepareStatement(sql);
			statement.setString(1, dto.getStudentName());
			statement.setString(2, dto.getDob());
			statement.setInt(3, dto.getAge());
			statement.setString(4, dto.getFatherName());
			statement.setString(5, dto.getMotherName());
			statement.setString(6, dto.getAddress());
			statement.setString(7, dto.getNationality());

			int rows = statement.executeUpdate();
			System.out.println("No. of Rows Affected= " + rows);
			return rows > 0;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

}

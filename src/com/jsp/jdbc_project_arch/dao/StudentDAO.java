package com.jsp.jdbc_project_arch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.jdbc_project_arch.connection.StudentConnection;
import com.jsp.jdbc_project_arch.dto.Student;

public class StudentDAO {
	
	Connection con = StudentConnection.getStudentConnection();

	public Student insertStudent(Student st) {		
		String student_insert_query = "insert into student values(?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(student_insert_query);
			ps.setInt(1, st.getId());
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setLong(4, st.getPhone());
			
			ps.execute();
			
			return st;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int updateStudent(int id, String name) {
		String student_update_query = "update student set name = ? where id = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(student_update_query);
			ps.setInt(2, id);
			ps.setString(1, name);
			
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public void studentDisplay() {
		String student_display_query = "select * from student";
		
		try {
			PreparedStatement ps = con.prepareStatement(student_display_query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				System.out.println("ID: " + id);
				String name = rs.getString("name");
				System.out.println("Name: " + name);
				String email = rs.getString("email");
				System.out.println("Email: " + email);
				long phone = rs.getLong("phone");
				System.out.println("Phone: " + phone);
				System.out.println("========================");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

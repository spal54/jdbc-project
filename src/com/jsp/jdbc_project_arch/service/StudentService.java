package com.jsp.jdbc_project_arch.service;

import com.jsp.jdbc_project_arch.dao.StudentDAO;
import com.jsp.jdbc_project_arch.dto.Student;

public class StudentService {
	
	StudentDAO st_dao = new StudentDAO();
	
	public Student studentInsertService(Student st) {
		if(st.getId() <= 9999) {
			System.out.println("===== Data Stored =====");
			return st_dao.insertStudent(st);
		} else {
			System.err.println("Invalid ID: ID should be max 4 digits!");
		}
		return null;
	}
	
//	public int studentUpdateService() {
//		
//	}
	
	public void studentDisplayService() {
		st_dao.studentDisplay();
	}

}

package com.jsp.jdbc_project_arch.dto;

//DTO POJO class
public class Student {
	
	private int id;
	private String name;
	private String email;
	private long phone;
	
	public Student(){}
	
	public Student(int id, String name, String email, long phone){
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getPhone() {
		return phone;
	}

}

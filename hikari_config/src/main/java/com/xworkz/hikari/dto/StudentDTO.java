package com.xworkz.hikari.dto;

public class StudentDTO {

	private String studentName;
	private String dob;
	private int age;
	private String fatherName;
	private String motherName;
	private String address;
	private String nationality;

	@Override
	public String toString() {
		return "StudentDTO [studentName=" + studentName + ", dob=" + dob + ", age=" + age + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", address=" + address + ", nationality=" + nationality + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}

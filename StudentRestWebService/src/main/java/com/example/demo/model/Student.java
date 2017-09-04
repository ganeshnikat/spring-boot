package com.example.demo.model;

public class Student {

	int studentId;
	String studentFirstName;
	String studentLastName;
	String studentEmailId;
	String studentState;
	String studentAddress;
	int studentAreaPinCode;

	public Student() {
		super();
	}

	public Student(int studentId, String studentFirstName, String studentLastName, String studentEmailId,
			String studentState, String studentAddress, int studentAreaPinCode) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentEmailId = studentEmailId;
		this.studentState = studentState;
		this.studentAddress = studentAddress;
		this.studentAreaPinCode = studentAreaPinCode;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentEmailId() {
		return studentEmailId;
	}

	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}

	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public int getStudentAreaPinCode() {
		return studentAreaPinCode;
	}

	public void setStudentAreaPinCode(int studentAreaPinCode) {
		this.studentAreaPinCode = studentAreaPinCode;
	}

}

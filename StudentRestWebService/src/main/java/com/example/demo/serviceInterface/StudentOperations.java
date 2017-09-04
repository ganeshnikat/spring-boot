package com.example.demo.serviceInterface;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentOperations {

	public List<Student> getStudentByName(List<Student> studenLlist,String name);

	public List<Student> getStudentByState(List<Student> studenLlist,String stateName);

	public List<Student> getStudentByStudentId(List<Student> studenLlist,int id);

	public List<Student> getStudentByStudenAreaPincode(List<Student> studenLlist,int pincode);
	
	public List<Student> getAllStudent(List<Student> studenLlist);
}

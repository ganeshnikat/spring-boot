package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviceImpl.StudentOperationsImpl;

@RestController
public class StudentDashboard {

	@Autowired
	StudentOperationsImpl studentOperationsImpl;

	@RequestMapping("/student-dashboard")
	public String studentHome() {
		
		return "Welcome to Student Dashboard";
	}

	@RequestMapping("/get-student-by-name")
	public List<Student> getStudentInfo(@RequestParam(value = "name") String name) {

		List<Student> studentList = studentOperationsImpl.getStudentByName(createStudentList(),name);
		return studentList;
	}
	@RequestMapping("/get-student-by-id")
	public List<Student> getStudentInfoById(@RequestParam(value = "studentId") int id) {
		
		List<Student> studentList = studentOperationsImpl.getStudentByStudentId(createStudentList(), id);
		return studentList;
	}
	@RequestMapping("/get-student-by-pincode")
	public List<Student> getStudentInfoByPincode(@RequestParam(value = "pincode") int pincode) {
		
		List<Student> studentList = studentOperationsImpl.getStudentByStudenAreaPincode(createStudentList(), pincode);
		return studentList;
	}
	
	@RequestMapping("/get-student-by-state")
	public List<Student> getStudentInfoByState(@RequestParam(value = "state") String state) {
		List<Student> studentList = studentOperationsImpl.getStudentByState(createStudentList(), state);
		return studentList;
	}
	@RequestMapping("/get-all-student")
	public List<Student> getAllStudentInfo() {
		List<Student> studentList = studentOperationsImpl.getAllStudent(createStudentList());
		return studentList;
	}

	public List<Student>  createStudentList() {
		List<Student> studentInfo = new ArrayList<Student>();
		studentInfo.add(new Student(1, "Ganesh", "ABC", "ganesh@gmail.com", "MH", "ABC", 123456));
		studentInfo.add(new Student(2, "Vijay", "ABC", "vijay@gmail.com", "MP", "XYZ", 345678));
		studentInfo.add(new Student(3, "Gaurav", "ABC", "gaurav@gmail.com", "MH", "RTS", 432156));
		studentInfo.add(new Student(4, "Dinesh", "ABC", "dinesh@gmail.com", "MH", "PQR",321456));
		studentInfo.add(new Student(5, "Shilpa", "ABC", "shilpa@gmail.com", "MP", "XYZ", 543213));
		studentInfo.add(new Student(5, "Shubham", "ABC", "shubham@gmail.com", "AP", "XYZ", 432134));
		studentInfo.add(new Student(5, "Shubham", "ABC", "patil@gmail.com", "AP", "XYZ", 567432));
		return studentInfo;
	}
}

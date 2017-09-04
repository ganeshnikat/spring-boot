package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.serviceInterface.StudentOperations;


@Service
public class StudentOperationsImpl implements StudentOperations{
	List<Student> studentmodifiedList=new ArrayList<Student>();
	@Override
	public List<Student> getStudentByName(List<Student> studenLlist, String name) {
		studentmodifiedList.clear();
		for (Student student : studenLlist) {
		  if(student.getStudentFirstName().equals(name)){
			  studentmodifiedList.add(student);
		  }
		}
		if(studentmodifiedList.isEmpty()){
			
		}
		return studentmodifiedList;
	}

	@Override
	public List<Student> getStudentByState(List<Student> studenLlist, String stateName) {
		studentmodifiedList.clear();
		for (Student student : studenLlist) {
			  if(student.getStudentState().equals(stateName)){
				  studentmodifiedList.add(student);
			  }
			}
		return studentmodifiedList;
	}

	@Override
	public List<Student> getStudentByStudentId(List<Student> studenLlist, int id) {
		studentmodifiedList.clear();
		for (Student student : studenLlist) {
			  if(student.getStudentId()==id){
				  studentmodifiedList.add(student);
			  }
			}
		return studentmodifiedList;
	}

	@Override
	public List<Student> getStudentByStudenAreaPincode(List<Student> studenLlist, int pincode) {
		studentmodifiedList.clear();
		for (Student student : studenLlist) {
			  if(student.getStudentAreaPinCode()==pincode){
				  studentmodifiedList.add(student);
			  }
			}
		return studentmodifiedList;
	}

	@Override
	public List<Student> getAllStudent(List<Student> studenLlist) {
		studentmodifiedList.clear();
		return studenLlist;
	}

	

}


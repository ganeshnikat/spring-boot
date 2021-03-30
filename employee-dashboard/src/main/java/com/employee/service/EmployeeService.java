package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.config.PasswordEncodeDecode;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	PasswordEncodeDecode encodeDecode;

	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee -> employees.add(encodeDecode.passwordEncode(employee)));
		return employees;
	}

	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}

	@Transactional
	public void saveOrUpdate(Employee employee) {
		employeeRepository.save(employee);
	}

	public void delete(int id) {
		employeeRepository.deleteById(id);
	}

	@Transactional
	public void deleteByUsername(String username) {
		employeeRepository.deleteByuserName(username);
	}

	public Employee getEmployeeByUsername(String username) {
		Employee employee = employeeRepository.findByuserName(username);
		if (Objects.isNull(employee)) {
			return new Employee();
		} else {
			employee.setPassword(encodeDecode.encrypt(employee.getPassword()));
			return employee;
		}
	}
}
package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee")
	private List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@DeleteMapping("/employee/{username}")
	private void deleteEmployee(@PathVariable("username") String username) {
		employeeService.deleteByUsername(username);
	}

	@PostMapping("/employee")
	private int saveEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return employee.getId();
	}

	@GetMapping("/employee/{username}")
	private Employee getEmployeeByUsername(@PathVariable("username") String username) {
		return employeeService.getEmployeeByUsername(username);
	}
}

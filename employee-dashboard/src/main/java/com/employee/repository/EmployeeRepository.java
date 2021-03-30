package com.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public Employee findByuserName(String username);

	public void deleteByuserName(String username);

}

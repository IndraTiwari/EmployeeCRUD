package com.itctraining.service;

import java.util.List;

import com.itctraining.model.Employee;

public interface EmployeeService {

	Employee save(Employee emp);

	public List<Employee> findAll();

	public Employee delete(int id);

	Employee findById(int id);

	Employee update(Employee emp);

}

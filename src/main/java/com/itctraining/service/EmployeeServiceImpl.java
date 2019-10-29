package com.itctraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itctraining.model.Employee;
import com.itctraining.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public Employee delete(int id) {
		Employee employee = findById(id);
		if (employee != null) {
			empRepository.delete(employee);
		}
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		return empRepository.findAll();
	}

	@Override
	public Employee findById(int id) {
		return empRepository.findById(id);
	}

	@Override
	public Employee update(Employee employee) {
		Employee updateemployee = empRepository.save(employee);
		
		return updateemployee;
	}

	@Override
	public Employee save(Employee emp) {
		return empRepository.save(emp);
	}


}

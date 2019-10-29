package com.itctraining.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itctraining.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	

	List<Employee> findAll();

	Employee findById(int id);

	Employee save(Employee emp);
	
	void delete(Employee emp);	

}
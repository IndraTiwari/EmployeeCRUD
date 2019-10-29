package com.itctraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itctraining.model.Employee;
import com.itctraining.service.EmployeeService;

@RestController
@RequestMapping({ "/api" })
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	//@PostMapping
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public Employee create(@RequestBody Employee emp) {
		return empService.save(emp);
	}
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	public Employee findById(@PathVariable("id") int id) {
		return empService.findById(id);
	}

	// @PutMapping
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.PUT)
	public Employee update(@RequestBody Employee emp) {
		return empService.update(emp);
	}

	// @DeleteMapping(path ={"/{id}"})
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
	public Employee delete(@PathVariable("id") int id) {
		return empService.delete(id);
	}

	// @GetMapping
	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public List<Employee> findAll() {
		return empService.findAll();
	}
	

}

package com.springrestwithmysql.springrestwithmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestwithmysql.springrestwithmysql.entity.Employee;
import com.springrestwithmysql.springrestwithmysql.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	@PostMapping("/addmultiple")
	public List<Employee> addAllEmployee(@RequestBody List<Employee> emp) {
		return service.addEmployeeList(emp);
	}
	
	@GetMapping("/display")
	public List<Employee> showAllEmployee(@RequestBody List<Employee> emp) { 
		return service.showEmployeeList(emp);
	}
	
	@GetMapping("/display/{id}")
	public Employee showEmployeeById(@PathVariable int id) {
		return service.showEmployee(id);
	}
	
	@GetMapping("/display/{name}")
	public Employee showEmployeeByName(@PathVariable String name) {
		return service.showEmployeeByName(name);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	
	@DeleteMapping("/remove")
	public String deleteAllEmployee() {
		return service.removeAllEmployee();
	}
	
	@DeleteMapping("/remove/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.removeEmployeeId(id);
	}
	
}

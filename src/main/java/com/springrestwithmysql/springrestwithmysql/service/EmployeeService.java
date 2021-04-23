package com.springrestwithmysql.springrestwithmysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestwithmysql.springrestwithmysql.entity.Employee;
import com.springrestwithmysql.springrestwithmysql.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	//save 1 employee - POST
	public Employee addEmployee(Employee emp) {
		return repo.save(emp);
	}
	
	//save list of employee - POST
	public List<Employee> addEmployeeList(List<Employee> emp) {
		return repo.saveAll(emp);
	}
	
	//Get List of employee -GET
	public List<Employee> showEmployeeList(List<Employee> emp) {
		return repo.findAll();
	}
	
	//Get List of single employee by id -GET
	public Employee showEmployee(int id) {
		return repo.findById(id).orElse(null);
	}
	
	//Get List of single employee by name -GET
	public Employee showEmployeeByName(String name) {
		return repo.findByName(name);
	}
	
	//Remove 1 employee on basis of ID  -DELETE
	public String removeEmployeeId(int id) {
		 repo.deleteById(id);
		 return "Employee " + id + " removed!";
	}
	
	//Remove all employee  -DELETE
	public String removeAllEmployee() {
		 repo.deleteAll();
		 return " All Employee Removed!";
	}
	
	//Update the item  -PUT
	public Employee updateEmployee(Employee emp) {
		Employee existingEmployee = repo.findById(emp.getId()).orElse(null);
		existingEmployee.setName(emp.getName());
		existingEmployee.setPost(emp.getPost());
		return repo.save(existingEmployee);
	}
	
}

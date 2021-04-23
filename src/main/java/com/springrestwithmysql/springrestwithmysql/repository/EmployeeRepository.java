package com.springrestwithmysql.springrestwithmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestwithmysql.springrestwithmysql.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByName(String name);

}

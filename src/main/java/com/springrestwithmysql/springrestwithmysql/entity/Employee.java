package com.springrestwithmysql.springrestwithmysql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMPLOYEE_DETAIL")
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String post;
	
	public Employee(int id, String name, String post) {
		super();
		this.id = id;
		this.name = name;
		this.post = post;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", post=" + post + "]";
	}
}

package com.lucaspires.springboot.crudemployee.dao;

import java.util.List;

import com.lucaspires.springboot.crudemployee.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void save(Employee theEmployee);
}
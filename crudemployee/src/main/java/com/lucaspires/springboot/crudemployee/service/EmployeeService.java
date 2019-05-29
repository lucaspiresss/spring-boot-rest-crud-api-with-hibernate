package com.lucaspires.springboot.crudemployee.service;

import java.util.List;

import com.lucaspires.springboot.crudemployee.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
}
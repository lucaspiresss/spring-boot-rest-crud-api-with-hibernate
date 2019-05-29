package com.lucaspires.springboot.crudemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucaspires.springboot.crudemployee.dao.EmployeeDAO;
import com.lucaspires.springboot.crudemployee.entity.Employee;

@Service
public class EmployeeSereviceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeSereviceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return employeeDAO.findById(id);
	}
}
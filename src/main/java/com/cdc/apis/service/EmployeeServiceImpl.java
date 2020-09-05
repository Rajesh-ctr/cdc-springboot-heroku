package com.cdc.apis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdc.apis.dao.EmployeeDaoImpl;
import com.cdc.apis.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDaoImpl employeeDaoObj;
	
	@Override
	public int insertEmployee(Employee employeeObj) {
		return employeeDaoObj.insertEmployee(employeeObj);
	}

}

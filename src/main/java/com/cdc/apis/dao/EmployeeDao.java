package com.cdc.apis.dao;

import java.util.List;

import com.cdc.apis.model.Employee;

public interface EmployeeDao {
	List<Employee> findAll();

	public int insertEmployee(Employee emp);

//	void updateEmployee(Employee emp);
//
//	void executeUpdateEmployee(Employee emp);

	public void deleteEmployee(Employee emp);
}

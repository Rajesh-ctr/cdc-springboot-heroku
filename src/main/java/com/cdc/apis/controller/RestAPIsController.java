package com.cdc.apis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdc.apis.model.Employee;
import com.cdc.apis.service.EmployeeServiceImpl;

@RestController
public class RestAPIsController {

	@Autowired
	EmployeeServiceImpl employeeService;

	@GetMapping("/api/helloworld")
	public String findAll() {
		System.out.println("Reached ...............");
		return "Hello World!";
	}

	@PostMapping(value = "/api/createEmp")
	public String createEmployee(@RequestBody Employee emp) {
		int recordCount = employeeService.insertEmployee(emp);
		return recordCount+" Record(s) inserted..";
	}

}

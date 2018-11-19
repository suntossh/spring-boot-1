package com.suntossh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.suntossh.main.model.Employee;
import com.suntossh.main.service.EmployeeSvc;

@RestController
public class MySSLController {

	@Autowired
	private EmployeeSvc employeeSvc;

	@GetMapping(value = "/employees/{name}")
	public Employee getEmployee(@PathVariable String name) {
		return employeeSvc.getEmployeeByName(name);
	}

}

package com.suntossh.main.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.suntossh.main.model.Employee;

@Service
public class EmployeeSvcImpl implements EmployeeSvc {

	private static Map<String, Employee> employeeRegister = new HashMap<>();
	static {
		employeeRegister.put("santosh", new Employee(1, "santosh", 34, "Male"));
		employeeRegister.put("rohan", new Employee(2, "rohan", 33, "Male"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.suntossh.main.service.EmployeeSvc1#getEmployeeByName(java.lang.
	 * String)
	 */
	@Override
	public Employee getEmployeeByName(String name) {
		return employeeRegister.get(name);
	}

}

package org.pramod.hibernate.service;

import org.pramod.hibernate.entity.Employee;
import org.pramod.hibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}

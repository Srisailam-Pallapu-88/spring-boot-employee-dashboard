package com.employee.dashboard.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dashboard.main.entity.Employee;
import com.employee.dashboard.main.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public Employee findById(int employeeId) {
		Optional<Employee> employeeOpt = employeeRepository.findById(employeeId);
		if (!employeeOpt.isEmpty()) {
			return employeeOpt.get();
		}
		return null;
	}

	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	public void update(Employee employee) {
		Optional<Employee> employeeOpt = employeeRepository.findById(employee.getId());
		Employee employeeTemp = null;
		if (!employeeOpt.isEmpty()) {
			employeeTemp = employeeOpt.get();
			employeeTemp.setFirstName(employee.getFirstName());
			employeeTemp.setLastName(employee.getLastName());
			employeeTemp.setAge(employee.getAge());
			employeeTemp.setGender(employee.getGender());
			employeeTemp.setCity(employee.getCity());
			employeeTemp.setPincode(employee.getPincode());
		} else {
			employeeTemp = employee;
		}
		employeeRepository.save(employeeTemp);
	}

	public void deleteById(int employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	public List<Employee> searchByName(String searchName) {
		List<Employee> foundEmployees = employeeRepository.findByName(searchName);
		return foundEmployees;
	}
}
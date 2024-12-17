package com.employee.dashboard.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.dashboard.main.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findAllByOrderByLastNameAsc();

	List<Employee> findAll();

	@Query(value = "SELECT * FROM employee WHERE firstname LIKE %:name% OR lastname LIKE %:name%", nativeQuery = true)
	List<Employee> findByName(String name);

	Employee save(Employee employee);

	void deleteById(int employeeId);

}
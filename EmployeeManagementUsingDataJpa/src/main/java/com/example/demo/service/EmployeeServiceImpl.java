package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployeeNotFound;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public String saveEmployee(Employee employee) {
		repository.save(employee);
		return "Employee saved Successfully";
	}

	@Override
	public String updateEmployee(Employee employee) {
		repository.save(employee);
		return "Employee Updated Successfully";
	}

	@Override
	public String deleteEmployee(int empId) {
		repository.deleteById(empId);
		return "Employee Deleted";
	}

	@Override
	public Employee getEmployee(int empId) throws EmployeeNotFound {

		Optional<Employee> optional = repository.findById(empId);
		
		if (optional.isEmpty()) {
			throw new EmployeeNotFound("No Employee Found With Given Id...");
		} else {
			return optional.get();
		}

	}

	@Override
	public List<Employee> getAllEmployee(Employee employee) {

		return repository.findAll();
	}

	@Override
	public List<Employee> getEmployeeByDesg(String empDesg) {

		return repository.getEmployeeByDesg(empDesg);
	}

	@Override
	public List<Employee> getEmployeeBetweenSal(int initialSal, int finalSal) {

		return repository.getEmployeeBetweenSal(initialSal, finalSal);
	}

}

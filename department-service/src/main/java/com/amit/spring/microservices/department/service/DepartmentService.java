package com.amit.spring.microservices.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.spring.microservices.department.entiry.Department;
import com.amit.spring.microservices.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside the method saveDepartment of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long departmentId) {
		log.info("Inside the method findDepartmentById of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
	
}

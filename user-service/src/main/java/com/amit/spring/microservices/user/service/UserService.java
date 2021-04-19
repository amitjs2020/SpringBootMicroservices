package com.amit.spring.microservices.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amit.spring.microservices.user.entiry.User;
import com.amit.spring.microservices.user.repository.UserRepository;
import com.amit.spring.microservices.user.vo.Department;
import com.amit.spring.microservices.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment of UserService");
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		ResponseEntity<Department> department = restTemplate.getForEntity("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
		responseTemplateVO.setUser(user);
		responseTemplateVO.setDepartment(department.getBody());
		return responseTemplateVO;
	}
}

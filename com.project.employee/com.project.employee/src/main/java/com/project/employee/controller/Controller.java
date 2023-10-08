package com.project.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.model.Employee;
import com.project.employee.repository.EmpRepository;

@RestController
@RequestMapping("/homess")
public class Controller {
	
	
	
	
	@PostMapping("/post")
	
	public String updateDetails(@RequestBody Employee empobj) {
		
		//emp.save(empobj);
		
		return "added";
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

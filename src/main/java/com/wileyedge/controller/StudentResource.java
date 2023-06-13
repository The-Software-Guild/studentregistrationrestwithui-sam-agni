package com.wileyedge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wileyedge.dto.Student;
import com.wileyedge.service.IService;

@RestController
@CrossOrigin(origins = "*")
public class StudentResource {
	@Autowired
	private IService service;
	
	@GetMapping(path = "/students")
	public List<Student> fetchAllStudents(){
		List<Student> students = service.retrieveAllUsers();
		return students;
	}
	
	@GetMapping(path = "/students/{id}")
	public Student fetchStudent(@PathVariable int id) {
		Student s = service.retrieveOne(id);
		return s;
	}
	
	@PostMapping(path = "/students", consumes = "application/json")
	public Student createStudent(@RequestBody Student s) {
		service.save(s);
		return s;
	}
	
	@DeleteMapping(path = "/students/{id}")
	public void deleteuser(@PathVariable int id) {
		service.deleteOneUser(id);
	}
}

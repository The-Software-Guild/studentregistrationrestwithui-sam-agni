package com.wileyedge.service;

import java.util.List;

import com.wileyedge.dto.Student;

public interface IService {

	public List<Student> retrieveAllUsers();
	public Student retrieveOne(int id);
	public Student save(Student user);
	public void deleteOneUser(int id);
}

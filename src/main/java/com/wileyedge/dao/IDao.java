package com.wileyedge.dao;

import java.util.List;
import java.util.Optional;

import com.wileyedge.dto.Student;

public interface IDao {

	public Student save(Student user);
	public List<Student> findAll();
	public Optional<Student> findById(int id);
	public Student deleteById(int id);
}

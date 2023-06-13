package com.wileyedge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wileyedge.dao.IDao;
import com.wileyedge.dto.Student;

@Service
public class StudentService implements IService {
	@Autowired
	@Qualifier(value = "jparepos")
	private IDao dao;

	@Override
	public List<Student> retrieveAllUsers() {
		List<Student> students = dao.findAll();
		return students;
	}

	@Override
	public Student retrieveOne(int id) {
		Optional<Student> opt = dao.findById(id);
		Student student = null;
		if (opt.isPresent()) {
			student = opt.get();
		}
		return student;
	}

	@Override
	public Student save(Student user) {
		Student s = dao.save(user);
		return s;
	}

	@Override
	public void deleteOneUser(int id) {
		dao.deleteById(id);
	}

}

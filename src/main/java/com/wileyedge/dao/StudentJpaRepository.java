package com.wileyedge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wileyedge.dto.Student;

@Repository(value = "jparepos")
public interface StudentJpaRepository extends IDao, JpaRepository<Student, Integer> {

}

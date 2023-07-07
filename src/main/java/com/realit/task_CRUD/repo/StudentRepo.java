package com.realit.task_CRUD.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.realit.task_CRUD.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
    

}

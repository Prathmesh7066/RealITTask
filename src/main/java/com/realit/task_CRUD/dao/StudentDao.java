package com.realit.task_CRUD.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.realit.task_CRUD.dto.Student;
import com.realit.task_CRUD.repo.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	private StudentRepo studentRepo;

	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	public Student getStudentById(int id) {
		Optional<Student> student = studentRepo.findById(id);
		if (student.isPresent()) {
			return student.get();
		}
		return null;
	}

	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	public Student updateStudentById(int id, Student student) {
		Optional<Student> dbstudent = studentRepo.findById(id);
		if (dbstudent.isPresent()) {
			student.setId(id);
			return studentRepo.save(student);
		}
		return null;
	}

	public Student deleteStudentById(int id) {
		Optional<Student> student = studentRepo.findById(id);
		if (student.isPresent()) {
			studentRepo.delete(student.get());

			return student.get();
		}
		return null;
	}
	

}

package com.realit.task_CRUD.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.realit.task_CRUD.dao.StudentDao;
import com.realit.task_CRUD.dto.Student;

@RestController
public class StudentController {
	private StudentDao studentDao;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentDao.saveStudent(student);
	}

	@GetMapping("/fetch/{id}")
	public Student fetchStudentById(@PathVariable int id) {
		return studentDao.getStudentById(id);
	}

	@GetMapping("/fetchAll")
	public List<Student> fetchAll() {
		return studentDao.getAllStudent();
	}

	@PutMapping("/update")
	public Student update(@RequestParam int id, @RequestBody Student student) {
		return studentDao.updateStudentById(id, student);
	}

	@DeleteMapping("/delete")
	public Student deleteStudent(@RequestParam int id) {
		return studentDao.deleteStudentById(id);
	}

}

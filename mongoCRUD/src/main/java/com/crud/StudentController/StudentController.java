package com.crud.StudentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Repository.IStudentRepository;
import com.crud.entity.Student;

@RestController
public class StudentController {
	
@Autowired
public IStudentRepository StudentRepository;

@PostMapping("/addstudent")
public ResponseEntity<?> addStudent(@RequestBody Student student){
	Student save=this.StudentRepository.save(student);
	return ResponseEntity.ok(save);
}
@GetMapping("/getstudent")
public ResponseEntity<?> getStudents(){
	return ResponseEntity.ok(this.StudentRepository.findAll());

}}

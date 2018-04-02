package com.onahump.demo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.onahump.demo.model.Student
import com.onahump.demo.repository.StudentRepository

@Service
class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository

	@Override
	Iterable<Student> listAllStudents(){
		studentRepository.findAll()
	}
	
	@Override
	Student getStudentById(Integer id){
		studentRepository.findOne(id)
	}

	@Override
	Student saveStudent(Student student){
		studentRepository.save(student)
	}

	@Override
	Student deleteStudent(Integer id){
		studentRepository.delete(id)
	}
}
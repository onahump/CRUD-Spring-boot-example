package com.onahump.demo.service

import com.onahump.demo.model.Student

interface StudentService{

	Iterable<Student> listAllStudents()
	
	Student getStudentById(Integer id)

	Student saveStudent(Student student)

	Student deleteStudent(Integer id)
}
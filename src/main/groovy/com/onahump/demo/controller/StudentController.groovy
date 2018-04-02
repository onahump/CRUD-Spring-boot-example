package com.onahump.demo.controller

import com.onahump.demo.model.Student
import com.onahump.demo.service.StudentService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMethod



@Controller
class StudentController{

	@Autowired 
	StudentService studentService

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	String allStudents(Model model){
		model.addAttribute("students", studentService.listAllStudent())
		"students"
	}

	@RequestMapping("students/{id}")
	String showStudents(@PathVariable Integer id, Model model){
		model.addAttribute("student", studentService.getStudentById(id))
		"studentShow"
	}

	@RequestMapping("students/edit/{id}")
	String editStudent(@PathVariable Integer id, Model model){
		model.addAttribute("student", studentService.getStudentById(id))
		"studentForm"
	}

	@RequestMapping("student/new")
	String newStudent(Model model){
		model.addAttribute("student", new Student())
		return"studentForm"
	}

	@RequestMapping(value = "student", method = RequestMethod.POST)
	String saveStudent(Student student){
		studentService.saveStudent(student)
		return "redirect:/student/" + student.id()
	}

	@RequestMapping("student/delete/{id}")
	String deleteStudent(@PathVariable Integer id){
		studentService.deleteStudent(id)
		return "redirect:/students"
	}
	
}
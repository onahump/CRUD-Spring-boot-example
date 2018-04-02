package com.onahump.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bin.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMethod

import com.onahump.demo.Student
import com.onahump.demo.StudentService

@Controller
class HomeController{

	@Autowired 
	StudentService studentService

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	String allStudents(Model model){
		model.addAttribute("students", studentService.listAllStudent())
		"students"
	}

	@RequestMapping(value = "students/{id}")
	String allStudents(@PathVariable Integer id, Model model){
		model.addAttribute("student", studentService.getStudentById(id))
		"studentShow"
	}

	@RequestMapping(value = "students/edit/{id}")
	String allStudents(@PathVariable Integer id, Model model){
		model.addAttribute("student", studentService.getStudentById(id))
		"studentForm"
	}

	@RequestMapping("student/new")
	String allStudents(Model model){
		model.addAttribute("student", new Student())
		"studentForm"
	}

	@RequestMapping(value = "student", method = RequestMethod.POST)
	String allStudents(Student student){
		studentService.saveStudent(student))
		return "redirect:/student/" + student.id()
	}

	@RequestMapping("student/delete/{id}")
	String allStudents(@PathVariable Integer id){
		studentService.deleteStudent(id)
		return "redirect:/students"
	}
	
}
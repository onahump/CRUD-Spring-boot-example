package com.onahump.demo

import java.persistence.*

class Student{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id 

	String name

	String lastName

	Date date

}
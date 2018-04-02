package com.onahump.demo.model

import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull

@Entity
class Student{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id 
	
	@NotNull
	String name

	@NotNull
	String lastName

	@NotNull
	Date date

}
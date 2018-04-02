package com.onahump.demo.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.transaction.annotation.Transactional

import com.onahump.demo.model.Student

@Transactional
interface StudentRepository extends CrudRepository <Student, Integer>{

}
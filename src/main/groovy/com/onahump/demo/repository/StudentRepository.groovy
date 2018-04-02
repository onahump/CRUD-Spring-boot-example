package com.onahump.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.transaction.annotation.Transactional

import com.onahump.demo.model.Student

@Transactional
inteface StudenRepository extends CrudRepository <Student, Integer>{

}
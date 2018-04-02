package com.onahump.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bin.annotation.RequestMapping

@Controller
class HomeController{

	@RequestMapping("/")
	String home(){
		"home"
	}
}
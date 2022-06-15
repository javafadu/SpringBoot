package com.tpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome( ) {
		return "Welcome to Student Controller";
	}
	
}

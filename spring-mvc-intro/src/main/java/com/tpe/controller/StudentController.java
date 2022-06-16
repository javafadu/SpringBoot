package com.tpe.controller;

import com.tpe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;



    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome( ) {
        return "Welcome to Student Controller";
    }


    @RequestMapping(value="/students", method = RequestMethod.GET)
    public ModelAndView getStudents() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("students",studentService.getAll());
        mav.setViewName("students");
        return mav;
    }



}




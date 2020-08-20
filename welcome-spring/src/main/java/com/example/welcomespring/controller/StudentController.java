package com.example.welcomespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("")
    public String showForm(){
        return "student-form";
    }

    @PostMapping("")
    public String showInfo(HttpServletRequest request, ModelMap model){
        String name = request.getParameter("name");
        String gpa = request.getParameter("gpa");
        String major = request.getParameter("major");
        model.addAttribute("name", name);
        model.addAttribute("gpa", gpa);
        model.addAttribute("major", major);
        return "student-info";
    }
}

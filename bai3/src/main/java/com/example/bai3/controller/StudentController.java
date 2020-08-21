package com.example.bai3.controller;

import com.example.bai3.model.Major;
import com.example.bai3.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @ModelAttribute("majors")
    List<Major> getMajors(){
        List<Major> list = new ArrayList<>();
        Major m1 = new Major(1, "java1");
        Major m2 = new Major(2, "java2");
        Major m3 = new Major(3, "java3");
        list.add(m1);
        list.add(m2);
        list.add(m3);
        return list;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(ModelMap model){
        Student student = new Student("ST1","Nguyen Hung");
        model.addAttribute("student", student);
        student.setMajorId(1);
        return "students/add";
    }

    @PostMapping("/add")
    public String save(ModelMap model, Student student){
        System.out.println("Name: "+ student.getName());
        Student student1 = new Student();
        model.addAttribute("student", student1);
        return "students/add";
    }
}

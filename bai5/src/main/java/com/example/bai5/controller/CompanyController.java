package com.example.bai5.controller;

import com.example.bai5.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {
    @Autowired
    Company company;
    @GetMapping("/")
    public String index(){
        System.out.println("Company in controller: " + company.getName());
        return "index";
    }
}

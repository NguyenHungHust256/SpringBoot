package com.example.baitap5.controller;

import com.example.baitap5.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    User user;
    @GetMapping("/")
    @ResponseBody
    public String hello(){
        System.out.println(user.getUserName());
        return "hefdfshe";
    }
}

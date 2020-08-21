package com.example.bai2.controller;

import com.example.bai2.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping("/new")
    public String showNew(){
        return "users/addOrEdit";
    }

//    @PostMapping("/saveOrUpdate")
//    public String saveOrUpdate(ModelMap model, HttpServletRequest request){
//        String userName = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        model.addAttribute("username", userName);
//        model.addAttribute("password", password);
//        return "users/detail";
//    }

//    @PostMapping("/saveOrUpdate")
//    public String saveOrUpdate(ModelMap model, @RequestParam("username") String userName,
//                               @RequestParam("password") String password){
//        model.addAttribute("username", userName);
//        model.addAttribute("password", password);
//        return "users/detail";
//    }

    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(ModelMap model, User user){
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        return "users/detail";
    }

}

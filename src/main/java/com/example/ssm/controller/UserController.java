package com.example.ssm.controller;

import com.example.ssm.model.User;
import com.example.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/addUser")
    public String add(){
        User user = new User();
        user.setUserName("zhangsan");
        user.setAge(30);
        this.service.addUser(user);
        return "user";
    }
}

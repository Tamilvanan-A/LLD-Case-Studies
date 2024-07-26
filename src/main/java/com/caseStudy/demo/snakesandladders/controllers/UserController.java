package com.caseStudy.demo.snakesandladders.controllers;

import com.caseStudy.demo.snakesandladders.models.User;
import com.caseStudy.demo.snakesandladders.service.UserService;

public class UserController {
    private UserService userService=new UserService();

    public User createUser(Integer id,String userName,String email) {
        return  userService.createUser(id,userName,email);
    }
}

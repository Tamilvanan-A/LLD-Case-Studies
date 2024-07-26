package com.caseStudy.demo.snakesandladders.repositories;

import com.caseStudy.demo.snakesandladders.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User>users=new ArrayList<>();

    public User save(User user) {
        this.users.add(user);
        return user;
    }
}

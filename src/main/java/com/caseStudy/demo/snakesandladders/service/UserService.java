package com.caseStudy.demo.snakesandladders.service;

import com.caseStudy.demo.snakesandladders.models.User;
import com.caseStudy.demo.snakesandladders.repositories.UserRepository;

public class UserService {
     UserRepository userRepository=new UserRepository();

     public User createUser(Integer id, String username,String email) {
         return userRepository.save(
                 User.builder().userId(id).userName(username).email(email).build()
         );
     }
}

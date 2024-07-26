package com.caseStudy.demo.bookmyshow.repositories;

import com.caseStudy.demo.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
          Optional<User> findUserByUsername(String username);
}

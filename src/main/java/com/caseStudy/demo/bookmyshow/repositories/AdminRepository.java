package com.caseStudy.demo.bookmyshow.repositories;

import com.caseStudy.demo.bookmyshow.models.Admin;
import com.caseStudy.demo.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    List<Admin>findAllByUserAndPhone1AndPhone2(User user,String phone1,String phone2);
}

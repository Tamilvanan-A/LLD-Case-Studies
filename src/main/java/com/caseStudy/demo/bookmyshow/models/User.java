package com.caseStudy.demo.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "USERS")
public class User {
    private Long id;
    private String email;
    private String username;
    private String phone;

    @ManyToMany
    private Set<Role>roles=new HashSet<>();

}

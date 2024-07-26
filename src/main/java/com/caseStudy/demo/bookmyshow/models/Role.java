package com.caseStudy.demo.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ROLES")
public class Role {
    private String name;
    private String description;

}

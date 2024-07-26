package com.caseStudy.demo.parkinglot.models;

import lombok.Data;

import java.sql.Date;
@Data
public class BaseClass {
    private long id;
    private Date createdAt;
    private Date updatedAt;

}

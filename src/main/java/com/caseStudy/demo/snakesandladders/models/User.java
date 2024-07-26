package com.caseStudy.demo.snakesandladders.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String userName;
    private Integer userId;
    private String email;
}

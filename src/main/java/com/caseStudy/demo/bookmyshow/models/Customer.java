package com.caseStudy.demo.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    private String nickname;
    private String level;

    @OneToOne
    private User user;
    @OneToMany
    private List<Bookings>bookings=new ArrayList<>();
}

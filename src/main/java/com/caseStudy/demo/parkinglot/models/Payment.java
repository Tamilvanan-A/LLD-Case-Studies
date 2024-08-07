package com.caseStudy.demo.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private String ticketId;
    private Integer amount;
    private PaymentType mode;
    private PaymentStatus status;
}

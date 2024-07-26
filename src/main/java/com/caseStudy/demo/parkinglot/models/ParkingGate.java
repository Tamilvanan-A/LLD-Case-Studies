package com.caseStudy.demo.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ParkingGate {
    private String location;
    private ParkingAttendant Attendant;
}

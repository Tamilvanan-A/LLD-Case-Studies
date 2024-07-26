package com.caseStudy.demo.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class ParkingFloor extends BaseClass{
    private Integer floorNumber;
    private String name;
    private List<ParkingSpot> parkingSpots=new ArrayList<>();

}

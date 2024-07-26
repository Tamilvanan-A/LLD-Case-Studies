package com.caseStudy.demo.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot extends BaseClass{
    private Integer spotId;
    private Integer floorNumber;
    private VehicleType vehicleType;
    private ParkingSpotStatus parkingSpotStatus;

}

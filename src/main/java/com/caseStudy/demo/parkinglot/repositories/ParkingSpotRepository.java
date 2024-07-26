package com.caseStudy.demo.parkinglot.repositories;

import com.caseStudy.demo.parkinglot.models.ParkingSpot;
import com.caseStudy.demo.parkinglot.models.ParkingSpotStatus;
import com.caseStudy.demo.parkinglot.models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotRepository {
    List<ParkingSpot> parkingSpots=new ArrayList<>();

    public ParkingSpot save(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }
    public ParkingSpot findOneByVehicleTypeAndStatusAvailable(VehicleType vehicleType) {
        for(ParkingSpot parkingSpot:parkingSpots) {
            if(parkingSpot.getParkingSpotStatus()== ParkingSpotStatus.FREE && parkingSpot.getVehicleType()==vehicleType) {
                return parkingSpot;
            }
        }
        return null;
    }
}

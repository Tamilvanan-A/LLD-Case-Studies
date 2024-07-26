package com.caseStudy.demo.parkinglot.services;

import com.caseStudy.demo.parkinglot.models.ParkingSpot;
import com.caseStudy.demo.parkinglot.models.VehicleType;
import com.caseStudy.demo.parkinglot.repositories.ParkingSpotRepository;

public class SlotAllocationService {
    private ParkingSpotRepository parkingSpotRepository= new ParkingSpotRepository();

    public ParkingSpot allocateSlot(VehicleType vehicleType) {
        return parkingSpotRepository.findOneByVehicleTypeAndStatusAvailable(vehicleType);
    }
}

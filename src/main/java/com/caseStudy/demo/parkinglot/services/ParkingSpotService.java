package com.caseStudy.demo.parkinglot.services;

import com.caseStudy.demo.parkinglot.models.ParkingSpot;
import com.caseStudy.demo.parkinglot.repositories.ParkingSpotRepository;

public class ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository=new ParkingSpotRepository();

    public void markSlotBooked(ParkingSpot spot) {
        parkingSpotRepository.save(spot);
    }
}

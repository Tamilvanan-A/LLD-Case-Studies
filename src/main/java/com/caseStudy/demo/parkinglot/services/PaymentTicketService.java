package com.caseStudy.demo.parkinglot.services;

import com.caseStudy.demo.parkinglot.models.ParkingSpot;
import com.caseStudy.demo.parkinglot.models.PaymentTicket;
import com.caseStudy.demo.parkinglot.models.VehicleType;
import com.caseStudy.demo.parkinglot.repositories.PaymentTicketRepository;

import java.time.LocalDateTime;

public class PaymentTicketService {
    private PaymentTicketRepository paymentTicketRepository=new PaymentTicketRepository();

    public PaymentTicket createTicket(VehicleType vehicleType, ParkingSpot parkingSpot) {
        PaymentTicket paymentTickets=
                PaymentTicket.builder()
                        .entryTime(LocalDateTime.now())
                        .floorNumber(parkingSpot.getFloorNumber())
                        .slotNumber(parkingSpot.getSpotId())
                        .build();

        return paymentTicketRepository.save(paymentTickets);
    }
}

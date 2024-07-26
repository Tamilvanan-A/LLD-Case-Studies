package com.caseStudy.demo.parkinglot.services;

import com.caseStudy.demo.parkinglot.dtos.GetTicketDTO;
import com.caseStudy.demo.parkinglot.models.ParkingSpot;
import com.caseStudy.demo.parkinglot.models.ParkingSpotStatus;
import com.caseStudy.demo.parkinglot.models.PaymentTicket;
import com.caseStudy.demo.parkinglot.models.VehicleType;

public class EntryGateService {
    ParkingSpotService parkingSpotService=new ParkingSpotService();
    SlotAllocationService slotAllocationService= new SlotAllocationService();
    PaymentTicketService paymentTicketService=new PaymentTicketService();


    public GetTicketDTO createTicket(VehicleType vehicleType) {
        // Early returns
        ParkingSpot parkingSpot= slotAllocationService.allocateSlot(vehicleType);
        if(parkingSpot==null) {
            throw new RuntimeException("Slot Not Available");
        }
        //update parking slot
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        parkingSpotService.markSlotBooked(parkingSpot);

        //create and persist Ticket
        PaymentTicket paymentTicket=paymentTicketService.createTicket(vehicleType,parkingSpot);
        return GetTicketDTO
                .builder()
                .entryTime(paymentTicket.getEntryTime())
                .vehicleType(paymentTicket.getVehicleType())
                .build();
    }
}

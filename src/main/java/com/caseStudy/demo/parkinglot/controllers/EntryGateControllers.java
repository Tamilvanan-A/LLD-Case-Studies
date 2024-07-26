package com.caseStudy.demo.parkinglot.controllers;

import com.caseStudy.demo.parkinglot.dtos.GetTicketDTO;
import com.caseStudy.demo.parkinglot.models.VehicleType;
import com.caseStudy.demo.parkinglot.services.EntryGateService;

public class EntryGateControllers {
    EntryGateService entryGateService=new EntryGateService();
    public GetTicketDTO createTicket(VehicleType vehicleType) {
        return entryGateService.createTicket(vehicleType);
    }
}

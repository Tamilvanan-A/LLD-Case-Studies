package com.caseStudy.demo.parkinglot.models;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Builder
public class ParkingLot {
    private String name;
    private String address;
    @Builder.Default
    private List<ParkingFloor> parkingFloors=new ArrayList<>();
    @Builder.Default
    private List<EntryGate> entryGates=new ArrayList<>();
    @Builder.Default
    private List<ExitGate> exitGates= new ArrayList<>();
}

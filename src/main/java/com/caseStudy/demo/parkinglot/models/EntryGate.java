package com.caseStudy.demo.parkinglot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EntryGate extends ParkingGate{
    private DisplayBoard displayBoard;
}

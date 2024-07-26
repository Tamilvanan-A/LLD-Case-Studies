package com.caseStudy.demo.parkinglot.dtos;

import com.caseStudy.demo.parkinglot.models.VehicleType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Builder(toBuilder = true)
public class GetTicketDTO {
    private VehicleType vehicleType;
    private LocalDateTime entryTime;
}

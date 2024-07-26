package com.caseStudy.demo.parkinglot.strategies.factoryStrategyAlgorithm;

import com.caseStudy.demo.parkinglot.models.VehicleType;

public interface FeesCalculationFactory {
    public FeesStrategy getStrategy(VehicleType vehicleType);
}

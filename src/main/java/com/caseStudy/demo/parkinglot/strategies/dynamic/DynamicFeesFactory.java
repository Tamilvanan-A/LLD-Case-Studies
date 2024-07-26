package com.caseStudy.demo.parkinglot.strategies.dynamic;

import com.caseStudy.demo.parkinglot.models.VehicleType;
import com.caseStudy.demo.parkinglot.strategies.factoryStrategyAlgorithm.FeesCalculationFactory;
import com.caseStudy.demo.parkinglot.strategies.factoryStrategyAlgorithm.FeesStrategy;
import com.caseStudy.demo.parkinglot.strategies.timeBased.SmallVehicleTimeStrategy;

public class DynamicFeesFactory implements FeesCalculationFactory {
    @Override
    public FeesStrategy getStrategy(VehicleType vehicleType) {
        switch (vehicleType) {
            case SMALL-> {
                return new SmallVehicleTimeStrategy();
            }
            case LARGE, MEDIUM -> {
                throw new RuntimeException("Not Implemented");
            }
        }
        throw new RuntimeException("Invalid Type");
    }
}

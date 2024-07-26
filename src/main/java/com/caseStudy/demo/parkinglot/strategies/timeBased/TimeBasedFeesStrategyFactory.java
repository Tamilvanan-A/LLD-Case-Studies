package com.caseStudy.demo.parkinglot.strategies.timeBased;

import com.caseStudy.demo.parkinglot.models.VehicleType;
import com.caseStudy.demo.parkinglot.strategies.factoryStrategyAlgorithm.FeesCalculationFactory;
import com.caseStudy.demo.parkinglot.strategies.factoryStrategyAlgorithm.FeesStrategy;

public class TimeBasedFeesStrategyFactory implements FeesCalculationFactory {

    @Override
    public FeesStrategy getStrategy(VehicleType vehicleType) {
        switch (vehicleType) {
            case LARGE -> {
                return new LargeVehicleTimeStrategy();
            }
            case  MEDIUM -> {
                return new MediumVehicleTimeStrategy();
            }
            case SMALL -> {
                return new SmallVehicleTimeStrategy();
            }
        }
        throw new RuntimeException("Invalid Type");
    }
}

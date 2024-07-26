package com.caseStudy.demo.parkinglot.strategies.factoryStrategyAlgorithm;

import com.caseStudy.demo.parkinglot.strategies.dynamic.DynamicFeesFactory;
import com.caseStudy.demo.parkinglot.strategies.timeBased.TimeBasedFeesStrategyFactory;

public class FeesStrategyFactory {
    public FeesCalculationFactory getFactory(String pricingScheme) {
        switch (pricingScheme) {
            case "TimeBased":
                return new TimeBasedFeesStrategyFactory();
            case "Dynamic":
                return new DynamicFeesFactory();
        }
        throw new RuntimeException();
    }
}

package com.caseStudy.demo.parkinglot.strategies.dynamic;

import com.caseStudy.demo.parkinglot.models.PaymentTicket;
import com.caseStudy.demo.parkinglot.strategies.factoryStrategyAlgorithm.FeesStrategy;

public class SmallVehicleDynamicStrategy implements FeesStrategy {
    @Override
    public int calculateFees(PaymentTicket paymentTicket) {
        return 0;
    }
}

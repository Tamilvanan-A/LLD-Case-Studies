package com.caseStudy.demo.parkinglot.strategies.timeBased;

import com.caseStudy.demo.parkinglot.models.PaymentTicket;
import com.caseStudy.demo.parkinglot.strategies.factoryStrategyAlgorithm.FeesStrategy;

public class LargeVehicleTimeStrategy implements FeesStrategy {
    @Override
    public int calculateFees(PaymentTicket paymentTicket) {
        return 0;
    }
}

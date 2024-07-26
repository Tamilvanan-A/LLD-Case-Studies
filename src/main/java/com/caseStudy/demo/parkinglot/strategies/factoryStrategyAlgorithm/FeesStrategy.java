package com.caseStudy.demo.parkinglot.strategies.factoryStrategyAlgorithm;

import com.caseStudy.demo.parkinglot.models.PaymentTicket;

public interface FeesStrategy {
    int calculateFees(PaymentTicket paymentTicket);
}

package com.caseStudy.demo.parkinglot.repositories;

import com.caseStudy.demo.parkinglot.models.PaymentTicket;

import java.util.ArrayList;
import java.util.List;

public class PaymentTicketRepository {
    private List<PaymentTicket>paymentTickets=new ArrayList<>();

    public PaymentTicket save(PaymentTicket ticket) {
        paymentTickets.add(ticket);
        return ticket;
    }
}

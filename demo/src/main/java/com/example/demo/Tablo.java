package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Tablo {
    TicketNumberGenerator ticketNumberGenerator;

    public Tablo(TicketNumberGenerator ticketNumberGenerator) {
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    Ticket newTicket(){
        Ticket ticket = new Ticket(ticketNumberGenerator.createNewNumber());
        return ticket;
    }
}

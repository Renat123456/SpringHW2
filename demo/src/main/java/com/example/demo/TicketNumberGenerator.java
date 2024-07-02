package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGenerator {

    public TicketNumberGenerator() {
    }

    String createNewNumber(){
        return "Ticket #" + UUID.randomUUID().toString();
    }

}

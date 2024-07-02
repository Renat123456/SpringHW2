package com.example.demo;

import java.time.LocalDateTime;

public class Ticket {
    String number;
    LocalDateTime createdAt;

    public Ticket(String number) {
        this.number = number;
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

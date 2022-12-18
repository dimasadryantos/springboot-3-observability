package com.dzcorp.springboot3observability.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class TicketController {

    private static final List<Ticket> inMemory = new ArrayList<>();

    static {
        inMemory.add(new Ticket(UUID.randomUUID(), "Bug ticket"));
        inMemory.add(new Ticket(UUID.randomUUID(), "New feature ticket"));
    }

    @GetMapping(value = "/tickets")
    public List<Ticket> getTickets() {
        return inMemory;
    }


}

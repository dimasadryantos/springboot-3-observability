package com.dzcorp.springboot3observability.controller;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Ticket {

    private UUID ticketId;

    private String ticketName;

}

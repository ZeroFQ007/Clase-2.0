package cl.duoc.segundaclase.tickets.controller;

import cl.duoc.segundaclase.tickets.model.Ticket;
import cl.duoc.segundaclase.tickets.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TicketController {
    private TicketService service;
    public TicketController(TicketService Service) {
        this.service = service;

    }
    @GetMapping
    public List<Ticket> getAllTickets() {
        return this.service.getTickets();
    }

}

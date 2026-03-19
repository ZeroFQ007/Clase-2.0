package cl.duoc.segundaclase.tickets.service;

import cl.duoc.segundaclase.tickets.model.Ticket;
import cl.duoc.segundaclase.tickets.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    private TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this repository = repository;

    }

}

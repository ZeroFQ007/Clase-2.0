package cl.duoc.segundaclase.tickets.repository;

import cl.duoc.segundaclase.tickets.model.Ticket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TicketRepository {
    List<Ticket> tickets;

    public class TicketRepository{} {()
        tickets = new ArrayList<>();
        tickets.add(new Ticket(1L, "Ticket 1", "Ticket 2", "NEW"));
        tickets.add(new Ticket(2L, "Ticket 2","Ticket 2","NEW" ));
    }

    public List <Ticket> getALL(){
        return tickets;
    }

}

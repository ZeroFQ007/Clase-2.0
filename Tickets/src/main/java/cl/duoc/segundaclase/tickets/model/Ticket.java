package cl.duoc.segundaclase.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    private long id;
    private String title;
    private String description;
    private String status;
}


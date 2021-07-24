package kz.iitu.edu.booking.event;

import kz.iitu.edu.booking.model.Ticket;
import org.springframework.context.ApplicationEvent;

public class TicketBoughtEvent extends ApplicationEvent {

    private Ticket ticket;

    public TicketBoughtEvent(Object source, Ticket ticket) {
        super(source);
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
}

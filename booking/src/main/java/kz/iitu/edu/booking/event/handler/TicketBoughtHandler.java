package kz.iitu.edu.booking.event.handler;

import kz.iitu.edu.booking.event.TicketBoughtEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;

@Component
public class TicketBoughtHandler implements ApplicationListener<TicketBoughtEvent> {
    @Override
    public void onApplicationEvent(TicketBoughtEvent ticketBoughtEvent) {
        System.out.println("Bought ticket: " + ticketBoughtEvent.getTicket());
    }
}

package kz.iitu.edu.booking.controller;

import kz.iitu.edu.booking.model.Ticket;
import kz.iitu.edu.booking.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    ITicketService iTicketService;

    @RequestMapping(method = RequestMethod.POST)
    public void createTicket(@RequestBody Ticket ticket){
        iTicketService.create(ticket);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteTicket(@PathVariable("id") Integer id){
        iTicketService.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Ticket> getAllTickets(){
        return iTicketService.getAllTickets();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/from")
    public List<Ticket> getTicketByFrom(@RequestParam(name = "from") String from){
        return iTicketService.getByFrom(from);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/to")
    public List<Ticket> getTicketByTo(@RequestParam(name = "to") String to){
        return iTicketService.getByTo(to);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/full")
    public List<Ticket> getTicketByFromAndTo(@RequestParam(name = "from") String from,
                                             @RequestParam(name = "to") String to){
        return iTicketService.getByFromAndTo(from, to);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/air-company")
    public List<Ticket> findTicketsByAirCompany_Name(@RequestParam("name") String name){
        return iTicketService.findTicketsByAirCompany_Name(name);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updatePrice(@PathVariable("id") Integer id,
                            @RequestParam(name = "status") Boolean status){
        iTicketService.update(id, status);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/id")
    public Ticket getTicketById(@PathVariable("id") Integer id){
        return iTicketService.getById(id);
    }

}

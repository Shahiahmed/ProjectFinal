package kz.iitu.edu.booking.service;

import kz.iitu.edu.booking.model.Ticket;

import java.util.List;

public interface ITicketService {
    void create(Ticket ticket);
    void delete(Integer id);
    List<Ticket> getAllTickets();
    Ticket getById(Integer id);
    List<Ticket> getByFrom(String from);
    List<Ticket> getByTo(String to);
    List<Ticket> getByFromAndTo(String from, String to);
    List<Ticket> findTicketsByAirCompany_Name(String name);
    void update(Integer id, Boolean status);
}
